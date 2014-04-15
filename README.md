## Gitblit Cookbook plugin

This plugin provides example implementations of all Gitblit extension points.

### Building, Deploying, Testing

To build, apply the changes and execute:

```
mvn clean package
```

To deploy, copy the generated cookbook zip file to your Gitblit `${baseFolder}/plugins` directory.

To test, restart Gitblit and execute:

```
$ ssh hostname -l username -p 29418 cookbook hello --french "'tout le monde'"
Bonjour tout le monde!
```

