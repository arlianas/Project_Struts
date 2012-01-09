
package com.myapp.struts;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class report extends HttpServlet {

    @Override
public void doGet (HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
    
        
    Attributeclass listener = (Attributeclass) getServletContext().getAttribute("link"); // edw pairnei to link
   
    String linkStr = listener.getLink();
    response.sendRedirect(linkStr);
}
  
    
}
