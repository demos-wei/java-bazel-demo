# Java bazel demo
A demo for java bazel, this demo integrate log4j.

The log4j configuration file is `src/main/resources/log4j.properties`, more info see [configuration doc](https://logging.apache.org/log4j/2.x/manual/configuration.html)

Build the application by running:
```shell
$ bazel build //:bazel_demo
$ bazel-bin/bazel_demo
#(print logs)
```
