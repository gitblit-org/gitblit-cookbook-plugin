/*
 * Copyright 2014 gitblit.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gitblit.plugin.cookbook;

import ro.fortsoft.pf4j.Extension;
import ro.fortsoft.pf4j.PluginWrapper;
import ro.fortsoft.pf4j.Version;

import com.gitblit.extensions.GitblitPlugin;
import com.gitblit.models.UserModel;
import com.gitblit.transport.ssh.commands.CommandMetaData;
import com.gitblit.transport.ssh.commands.DispatchCommand;

public class Plugin extends GitblitPlugin {

	public Plugin(PluginWrapper wrapper) {
		super(wrapper);
	}

	@Override
	public void start() {
		log.info("{} STARTED.", getWrapper().getPluginId());
	}

	@Override
	public void stop() {
		log.info("{} STOPPED.", getWrapper().getPluginId());
	}

	@Override
	public void onInstall() {
		log.info("{} INSTALLED.", getWrapper().getPluginId());
	}

	@Override
	public void onUpgrade(Version oldVersion) {
		log.info("{} UPGRADED from {}.", getWrapper().getPluginId(), oldVersion);
	}

	@Override
	public void onUninstall() {
		log.info("{} UNINSTALLED.", getWrapper().getPluginId());
	}


	/**
	 * You must register a dispatcher for your custom commands. The dispatcher
	 * must be annotated with CommandMetaData. This annotation will assign the
	 * plugin command namespace and offer a description.
	 *
	 */
	@Extension
	@CommandMetaData(name = "cookbook", description = "Example commands")
	public static class CookbookDispatcher extends DispatchCommand {
		@Override
		protected void setup(UserModel user) {
			register(user, HelloWorldCommand.class);
			register(user, StatusCommand.class);
		}
	}
}
