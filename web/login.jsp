<%-- 
    Document   : login
    Created on : 28 Δεκ 2011, 7:13:02 μμ
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
        <link rel="struts" type="text/css" href="struts.css">
    </head>
    <body>
        <h1>Login Form</h1>
        
        <html:form action="/login">
            
            <table border="2">
                
                <tbody>
                    <tr>
                        <td colspan="2">
                            <bean:write name="LoginForm" property="error" filter="false"/>
                            &nbsp;</td>
                    </tr>
                    <tr>
                        <td> Enter your name:</td>
                        <td> <html:text property="name" /></td>
                    </tr>
                    <tr>
                        <td> Enter your email:</td>
                        <td> <html:text property="email" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><html:submit value="Login" /></td>
                    </tr>
                </tbody>
            </table>

            
            
        </html:form>
        
        
    </body>
</html>
