@echo off
set CURDIR=.;
set ORIGCLASSPATH=%CLASSPATH%
set CLASSPATH=%CURDIR%;%CLASSPATH%

@echo on
java -jar ChatServer.jar
@echo off

set CLASSPATH=%ORIGCLASSPATH%