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
package com.gitblit.plugins.cookbook;

import ro.fortsoft.pf4j.Extension;
import ro.fortsoft.pf4j.Plugin;
import ro.fortsoft.pf4j.PluginWrapper;

import com.gitblit.models.UserModel;
import com.gitblit.transport.ssh.commands.CommandMetaData;
import com.gitblit.transport.ssh.commands.DispatchCommand;

public class GitblitCookbookPlugin extends Plugin {

  public GitblitCookbookPlugin(PluginWrapper wrapper) {
    super(wrapper);
  }

  @Override
  public void start() {
    // no op
  }

  @Override
  public void stop() {
    // no op
  }

  /**
   * You must register a dispatcher for your custom commands.  The dispatcher
   * must be annotated with CommandMetaData.  This annotation will assign the
   * plugin command namespace and offer a description.
   *
   */
  @Extension
  @CommandMetaData(name = "cookbook", description = "Example commands")
  public static class CookbookDispatcher extends DispatchCommand {
    @Override
    protected void registerCommands(UserModel user) {
        registerCommand(user, HelloWorldCommand.class);
        registerCommand(user, StatusCommand.class);
    }
  }
}
