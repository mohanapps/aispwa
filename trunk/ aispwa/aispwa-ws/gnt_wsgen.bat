set path=C:\Program Files\Java\jdk1.7.0_06\bin
set class=aiswa.aispwa_ws.services.AispwaDbServiceImpl
set clpth=%cd%\target\classes
set resourcedir=%cd%\target\m2e-wtp\web-resources
set outsourcedir=%cd%\src\main\java
set outdir=%cd%\src\main\webapp\WEB-INF
wsgen -cp "%clpth%" -wsdl -keep -r "%resourcedir%" -d "%outdir%" -s "%outsourcedir%"  %class%