package Creational;
import java.io.*;
abstract class Plan{  
    protected double rate;  
    abstract void getRate();  

    public void calculateBill(int units){  
         System.out.println(units*rate);  
     }  
}
class  DomesticPlan extends Plan{   
     public void getRate(){  
         rate=30;              
    }  
}
class  CommercialPlan extends Plan{  
 
	    public void getRate(){   
	        rate=100;  
	   }  
}
class  InstitutionalPlan extends Plan{    
	    public void getRate(){   
	        rate=500;  
	   }   
}
class GetPlanFactory{  
      
	       public Plan getPlan(String planType){  
	            if(planType == null){  
	             return null;  
	            }  
	          if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
	                 return new DomesticPlan();  
	               }   
	           else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
	                return new CommercialPlan();  
	            }   
	          else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
	                return new InstitutionalPlan();  
	          }  
	      return null;  
	   }  
	}


public class Factory {
	public static void main(String args[])throws IOException{  
	      GetPlanFactory planFactory = new GetPlanFactory();  
	        
	      String planName ="Commercialplan";
	      int units=100;  
	  
	      Plan p = planFactory.getPlan(planName);  
	       
	  
	       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.calculateBill(units);  
	            }  

}
