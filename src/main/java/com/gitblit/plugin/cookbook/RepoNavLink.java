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

import org.apache.wicket.PageParameters;

import ro.fortsoft.pf4j.Extension;

import com.gitblit.extensions.RepositoryNavLinkExtension;
import com.gitblit.models.NavLink;
import com.gitblit.models.NavLink.PageNavLink;
import com.gitblit.models.RepositoryModel;
import com.gitblit.models.UserModel;
import com.gitblit.wicket.WicketUtils;

/**
 * Adds an repository navigation link to all repository pages.
 *
 * @author James Moger
 *
 */
@Extension
public class RepoNavLink extends RepositoryNavLinkExtension {

	@Override
	public List<NavLink> getNavLinks(UserModel user, RepositoryModel repository) {
		PageParameters pp = WicketUtils.newRepositoryParameter(repository.name);
		NavLink link = new PageNavLink("cookbook", RepoNavPage.class, pp);
		return Arrays.asList(link);
	}

}
