@echo off

set LOADER_CLASS=org.infinispan.server.loader.Loader
set MAIN_CLASS=org.infinispan.server.security.UserTool
set ARGUMENTS=
set PROCESS_NAME=redhat-datagrid-user-tool

set "DIRNAME=%~dp0%"

setlocal EnableDelayedExpansion
call "!DIRNAME!common.bat" %*
setlocal DisableDelayedExpansion

"%JAVA%" %JAVA_OPTS% ^
   -Dvisualvm.display.name=%PROCESS_NAME% \
   -Djava.util.logging.manager=org.apache.logging.log4j.jul.LogManager ^
   "-Dinfinispan.server.home.path=%ISPN_HOME%" ^
   -classpath %CLASSPATH% %LOADER_CLASS% %MAIN_CLASS% %ARGUMENTS%
