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

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

import com.gitblit.transport.ssh.commands.CommandMetaData;
import com.gitblit.transport.ssh.commands.SshCommand;

/**
 * Example status command.
 */
@CommandMetaData(name = "hello", description = "Say hello in different languages")
public class HelloWorldCommand extends SshCommand {

  @Argument(usage = "name of user")
  private String name = "world";

  @Option(name = "--french", usage = "output in French?")
  private boolean french = false;

  @Override
  public void run() {
    String greeting = (french ? "Bonjour " : "Hello ");
    stdout.print(greeting + name + "!\n");
  }
}
