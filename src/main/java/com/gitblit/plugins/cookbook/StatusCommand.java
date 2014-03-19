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

import com.gitblit.manager.IGitblit;
import com.gitblit.models.ServerStatus;
import com.gitblit.transport.ssh.commands.CommandMetaData;
import com.gitblit.transport.ssh.commands.SshCommand;

/**
 * Example status command.
 */
@CommandMetaData(name = "status", description = "Display the server status")
public class StatusCommand extends SshCommand {

  @Override
  public void run() {
    IGitblit gitblit = getContext().getGitblit();
    ServerStatus status = gitblit.getStatus();
    stdout.print("version:        " + status.version + "\n");
    stdout.print("releaseDate:    " + status.releaseDate + "\n");
    stdout.print("isGO:           " + status.isGO + "\n");
    stdout.print("container:      " + status.servletContainer + "\n");
    stdout.print("bootDate:       " + status.bootDate + "\n");
    stdout.print("heap maximum:   " + status.heapMaximum + "\n");
    stdout.print("     allocated: " + status.heapAllocated + "\n");
    stdout.print("     free:      " + status.heapFree + "\n");
  }
}
