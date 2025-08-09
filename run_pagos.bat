@echo off
setlocal

set LIB=lib\gson-2.10.1.jar;lib\javafx\lib\*
set SRC=src
set OUT=out

if not exist %OUT% mkdir %OUT%
javac -cp %LIB% -d %OUT% %SRC%\pagos\*.java %SRC%\Main.java
if errorlevel 1 exit /b

java -cp %LIB%;%OUT% Main
pause