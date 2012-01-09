
package com.myapp.struts;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookieservlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            
            if ( (request.getParameter("quantity1") != null) && (request.getParameter("quantity2") != null) && (request.getParameter("quantity3") != null)) 
                    {
                            String quantity1 = request.getParameter("quantity1");
                            String quantity2 = request.getParameter("quantity2");
                            String quantity3 = request.getParameter("quantity3");
                    }

       if ((request.getParameter("quantity1")!= null) && (request.getParameter("quantity2")!= null) && (request.getParameter("quantity3")!= null))
                    {

                            String quantity1 = request.getParameter("quantity1");
                            String quantity2 = request.getParameter("quantity2");
                            String quantity3 = request.getParameter("quantity3");
   
                            if(quantity1==null ) quantity1="";
                            if(quantity2==null ) quantity2="";   
                            if(quantity3==null ) quantity3="";

                            Date nowq1 = new Date();
                            Date nowq2 = new Date();
                            Date nowq3 = new Date();
                            String timestampq1 = nowq1.toString();
                            String timestampq2 = nowq2.toString();
                            String timestampq3 = nowq3.toString();
                            Cookie cookieq1 = new Cookie ("quantity1",quantity1);
                            Cookie cookieq2 = new Cookie ("quantity2",quantity2);
                            Cookie cookieq3 = new Cookie ("quantity3",quantity3);
                            cookieq1.setMaxAge(365 * 24 * 60 * 60);
                            cookieq2.setMaxAge(365 * 24 * 60 * 60);
                            cookieq3.setMaxAge(365 * 24 * 60 * 60);
                            response.addCookie(cookieq1);
                            response.addCookie(cookieq2);
                            response.addCookie(cookieq3);
                    }    
       
                    RequestDispatcher view = request.getRequestDispatcher("index.jsp");
                    view.forward(request, response);
            }
            
         finally {            
            out.close();
        }
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            
                            String quantity1 = request.getParameter("quantity1");
                            String quantity2 = request.getParameter("quantity2");
                            String quantity3 = request.getParameter("quantity3");
                            
                            String cookieNameq1 = "quantity1";
                            String cookieNameq2 = "quantity2";
                            String cookieNameq3 = "quantity3";
                            Cookie cookiesq1 [] = request.getCookies ();
                            Cookie cookiesq2 [] = request.getCookies ();
                            Cookie cookiesq3 [] = request.getCookies ();
                            Cookie myCookieq1 = null;
                            Cookie myCookieq2 = null;
                            Cookie myCookieq3 = null;
                            if (cookiesq1 != null)
                            {
                                for (int i = 0; i < cookiesq1.length; i++) 
                                {
                                if (cookiesq1 [i].getName().equals (cookieNameq1))
                                {
                                myCookieq1 = cookiesq1[i];
                                break;
                                }
                                }
                                }
                            if (cookiesq2 != null)
                            {
                                for (int i = 0; i < cookiesq2.length; i++) 
                                {
                                if (cookiesq2 [i].getName().equals (cookieNameq2))
                                {
                                myCookieq2 = cookiesq2[i];
                                break;
                                }
                                }
                                }
                            if (cookiesq3 != null)
                            {
                                for (int i = 0; i < cookiesq3.length; i++) 
                                {
                                if (cookiesq3 [i].getName().equals (cookieNameq3))
                                {
                                myCookieq3 = cookiesq3[i];
                                break;
                                }
                                }
                                }
                            
                          
                            
             if (( quantity1 == null) && ( quantity2 == null) && (quantity3 == null)){ 
             if ((myCookieq1 != null) && (myCookieq2 != null) && (myCookieq3 != null)){
                     quantity1 = myCookieq1.getValue();
                     quantity2 = myCookieq2.getValue();
                     quantity3 = myCookieq3.getValue();}}
            
             
           } 
        
        
        finally {            
            out.close();
        }
    
}
}