<%-- 
    Document   : index
    Created on : Aug 31, 2017, 1:30:09 PM
    Author     : Vishal Prasad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BMI Calculator Page Page</title>
    </head>
    <body>
        <h1>Find Your BMI:</h1>    <%-- start web service invocation --%><hr/>
        
    <%
    try {
	org.mindfire.webservices.BmiCalculatorWS_Service service = new org.mindfire.webservices.BmiCalculatorWS_Service();
	org.mindfire.webservices.BmiCalculatorWS port = service.getBmiCalculatorWSPort();
	 // TODO initialize WS operation arguments here
	double height = 1.750d;
	double weight = 66.0d;
	// TODO process result here
	double result = port.calculateBMI(height, weight);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    
    <%-- end web service invocation --%><hr/>

    </body>
</html>
