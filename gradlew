#!/bin/sh
JAVA_EXE=java
APP_HOME=$(CDPATH= cd -- "$(dirname -- "$PRG")" && pwd -P)
exec "$JAVA_EXE" -classpath "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" \
  org.gradle.wrapper.GradleWrapperMain "$@"
