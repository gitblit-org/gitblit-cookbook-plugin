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

import java.util.Arrays;
import java.util.List;

import ro.fortsoft.pf4j.Extension;

import com.gitblit.extensions.UserMenuExtension;
import com.gitblit.models.Menu.MenuItem;
import com.gitblit.models.Menu.PageLinkMenuItem;
import com.gitblit.models.UserModel;

/**
 * Adds a Hello World user menu item.
 *
 * @author James Moger
 *
 */
@Extension
public class HelloWorldMenuLink extends UserMenuExtension {

	@Override
	public List<MenuItem> getMenuItems(UserModel user) {
		MenuItem link = new PageLinkMenuItem("Hello World!", HelloWorldPage.class);
		return Arrays.asList(link);
	}

}
