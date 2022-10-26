load("@rules_java//java:defs.bzl", "java_library", "java_binary")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "java-maven-lib",
    srcs = glob(["src/main/java/com/example/bazel/*.java"]),
    resources = glob(["src/main/resources/**"]),
    deps = ["@maven//:log4j_log4j"],
)

java_binary(
    name = "bazel_demo",
    main_class = "src.main.java.com.example.bazel.App",
    runtime_deps = [":java-maven-lib"],
)
