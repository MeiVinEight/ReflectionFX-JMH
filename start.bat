@echo off
cls
set compile=.\classes
java -Dfile.encoding=UTF-8 -classpath %compile%;.\dependency\commons-math3-3.2.jar;.\dependency\jmh-core-1.32.jar;.\dependency\jmh-generator-annprocess-1.32.jar;.\dependency\jopt-simple-4.6.jar;.\dependency\ReflectionFX-1.9.0.jar org.mve.Main