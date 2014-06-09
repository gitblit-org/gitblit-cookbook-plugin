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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ro.fortsoft.pf4j.Extension;

import com.gitblit.extensions.UserTeamLifeCycleListener;
import com.gitblit.models.TeamModel;
import com.gitblit.models.UserModel;

/**
 * Sample user/team lifecycle listener.
 *
 * @author James Moger
 *
 */
@Extension
public class MyUserTeamLifeCycleListener extends UserTeamLifeCycleListener {

    final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public void onCreation(UserModel user) {
    	log.info("Gitblit created user {}", user);
    }

    @Override
    public void onDeletion(UserModel user) {
    	log.info("Gitblit deleted user {}", user);
    }

    @Override
    public void onCreation(TeamModel team) {
    	log.info("Gitblit created team {}", team);
    }

    @Override
    public void onDeletion(TeamModel team) {
    	log.info("Gitblit deleted team {}", team);
    }
}