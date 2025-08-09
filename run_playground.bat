@echo off
REM ===============================
REM  COMPILAR Y EJECUTAR PLAYGROUND
REM ===============================

REM Carpeta donde están los .java
set SRC_DIR=src

REM Carpeta donde irán los .class compilados
set BIN_DIR=bin

REM Carpeta de librerías externas (.jar)
set LIB_DIR=lib

REM Nombre del paquete principal a ejecutar
set MAIN_CLASS=app.Main

echo ------------------------------------
echo LIMPIANDO CARPETA DE BINARIOS...
echo ------------------------------------
if exist %BIN_DIR% rmdir /s /q %BIN_DIR%
mkdir %BIN_DIR%

echo ------------------------------------
echo COMPILANDO EL PROYECTO...
echo ------------------------------------
javac -d %BIN_DIR% -cp "%LIB_DIR%\*" %SRC_DIR%\**\*.java
if errorlevel 1 (
    echo ERROR: Falló la compilación.
    pause
    exit /b
)

echo ------------------------------------
echo EJECUTANDO EL PROYECTO...
echo ------------------------------------
java -cp "%BIN_DIR%;%LIB_DIR%\*" %MAIN_CLASS%

echo.
pause
