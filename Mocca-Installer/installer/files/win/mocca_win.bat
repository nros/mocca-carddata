REM This is a start script for mocca on windows 
echo off 
start /MIN /B javaw -Djavax.net.ssl.trustStoreType=jks -Djavax.net.ssl.keyStoreType=jks -jar bin\mocca.jar

