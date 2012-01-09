<%-- 
    Document   : success
    Created on : 28 Δεκ 2011, 7:29:08 μμ
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<%@ page language="java" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>

<jsp:useBean id="coffee" class="com.myapp.struts.Bean" scope="session"/>
<jsp:setProperty name="coffee" property="*"/>
<jsp:useBean id="beer" class="com.myapp.struts.Bean" scope="session"/>
<jsp:setProperty name="beer" property="*"/>
<jsp:useBean id="whiskey" class="com.myapp.struts.Bean" scope="session"/>
<jsp:setProperty name="whiskey" property="*"/>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Success -> My Cafe-Bar</title>
        <link rel="struts" type="text/css" href="struts.css">
    </head>
    <body>
        
         
        <div id=shop style= " height:100%; width:100%; margin-left:auto; margin-right:auto; position:absolute; top:0%; right:0%; background:cornflowerblue;">
            <h1>Congratulations!</h1>
                
            <p>You have successfully logged in.</p>
                
            <p>Your name is: <bean:write name="LoginForm" property="name" />.</p>
                
            <p>Your email address is: <bean:write name="LoginForm" property="email" />.</p>
            
            <center><h1> MY CAFE-BAR </h1></center><br/>
            
            <center><h2> Αριστείδης Λιάνας </h2></center><br/>
            
            <center><h2>Products</h2></center><br/>
             
            <form name="ShopForm1"  method="post">
             
            <table border="1" align="center">
            
            <tr>
            <th><center>Item</center></th>
            <th><center>Price(€)</center> </th>
            <th><center>Quantity</center></th>
            <th><center>&nbsp;Total&nbsp;</center></th>
            </tr>
            <tr>
                
                   
            <td>Coffee</td>
            <td> <center>${initParam.contextprice1}</center></td>
            <td> <input type="text" name="quantity1" value="${coffee.quantity1}" </td>
            <td> ${(initParam.contextprice1)*(coffee.quantity1)} </td>
            
                
             
            <tr>
            <td>Beer</td>
            <td> <center>${initParam.contextprice2} </center></td>
            <td> <input type="text" name="quantity2" value="${beer.quantity2}" </td>
            <td>${(initParam.contextprice2)*(beer.quantity2)} </td>
            
            </tr>
            
             
            <tr>
            <td>Whiskey</td>
            <td><center> ${initParam.contextprice3}</center></td>
            <td> <input type="text" name="quantity3" value="${whiskey.quantity3}" </td>
            <td> ${(initParam.contextprice3)*(whiskey.quantity3)} </td>
            
            </tr>
             
            
            
            <tr>
            <td> Total  </td>
            <td> </td>
            <td>  </td>
            <td> ${(initParam.contextprice1)*(coffee.quantity1)+(initParam.contextprice2)*(beer.quantity2)+(initParam.contextprice3)*(whiskey.quantity3)} </td>
           
            </tr>
           
            </table><br/><br/><br/>
                                
         <center><input type="Submit" value="add to cart" onclick="Cookieservlet" /></center>
                                
         
            </form>
             
                                 <br/><br/><br/><br/>
                                 
             <form name="reportform2" action="report" method="get" >
                  &nbsp; <input type="Submit" value="Report" onclick="report" />
                  </form>
                  <form name="srcform2" action="Sourceservlet" method="get"  >
                  &nbsp; <input type="Submit" value="Source" onclick="Sourceservlet" />
                  </form>
            
            </div>

    </body>
</html>
