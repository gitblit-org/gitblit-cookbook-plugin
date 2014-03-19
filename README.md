Cookbook Gitblit plugin

This plugin currently depends on this change [1].

To build, apply the changes and execute:

```
mvn package
```

To deploy, create directory `${baseFolder}/plugins` and put the
cookbook-1.0.zip in this directory.

To test, execute:

```
$ ssh gitblit cookbook hello --french "'tout le monde'"
Bonjour tout le monde!
```

* [1] https://dev.gitblit.com/tickets/gitblit.git/6
