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

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

import com.gitblit.models.UserModel;
import com.gitblit.wicket.GitBlitWebSession;
import com.gitblit.wicket.pages.RootSubPage;

/**
 * Example root-level sub-page.
 *
 * @author James Moger
 *
 */
public class HelloWorldPage extends RootSubPage {

	public HelloWorldPage() {
		super();

		String who;
		UserModel user = GitBlitWebSession.get().getUser();
		if (user == null || UserModel.ANONYMOUS == user) {
			who = "World";
		} else {
			who = user.getDisplayName();
		}

		setupPage("Hello", who);
		add(new Label("who", who));

		add(new BookmarkablePageLink<Void>("gohome", app().getHomePage()));
	}
}
