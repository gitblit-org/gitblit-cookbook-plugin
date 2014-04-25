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

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;

import com.gitblit.models.RepositoryModel;
import com.gitblit.wicket.pages.RepositoryPage;

/**
 * Example repository page.
 *
 * This page displays the repository name.
 *
 * @author James Moger
 *
 */
public class RepoNavPage extends RepositoryPage {

	public RepoNavPage(PageParameters params) {
		super(params);

		RepositoryModel model = getRepositoryModel();

		add(new Label("cookbook.repositoryName", model.toString()));
	}

	@Override
	protected String getPageName() {
		return "cookbook";
	}
}
