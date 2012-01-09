
package com.myapp.struts;

import java.beans.*;
import java.io.Serializable;


public class Bean implements Serializable {
    
     private double quantity1; 
            private double quantity2;
            private double quantity3;
            public Bean()
            {
            this.quantity1 = 0.0;
            this.quantity2 = 0.0;
            this.quantity3 = 0.0;
            }
            
            
            public String getquantity1() 
            {
            return Double.toString(this.quantity1);
            }
            public void setquantity1(String value) 
            {
            try
            {
            this.quantity1 = Double.parseDouble(value);
            }
            catch (Exception e)
            {
            this.quantity1 = 0.0;
            }
            }
            
            
            public String getquantity2()
            {
            return Double.toString(this.quantity2);
            }
            public void setquantity2(String value) 
            {
            try
            {
            this.quantity2 = Double.parseDouble(value);
            
            }
            catch (Exception e)
            {
            this.quantity2 = 0.0;
            }
            }
            
            
            public String getquantity3() 
            {
            return Double.toString(this.quantity3);
            }
            public void setquantity3(String value) 
            {
            try
            {
            this.quantity3 = Double.parseDouble(value);
            }
            catch (Exception e)
            {
            this.quantity3 = 0.0;
            }
            }
}
