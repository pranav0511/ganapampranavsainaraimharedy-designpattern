package behaviour;
interface OfficeInternetAccess {  
    public void grantInternetAccess();  
} 
class RealInternetAccess implements OfficeInternetAccess {  
    private String employeeName;  
    public RealInternetAccess(String empName) {  
        this.employeeName = empName;  
    }  
  
    public void grantInternetAccess() {  
        System.out.println("Internet Access granted for employee: "+ employeeName);  
    }  
} 
class ProxyInternetAccess implements OfficeInternetAccess {  
    private String employeeName;  
    private RealInternetAccess  realaccess;  
        public ProxyInternetAccess(String employeeName) {  
     this.employeeName = employeeName;  
 }  
  
 public void grantInternetAccess()   
 {  
     if (getRole(employeeName) > 4)   
     {  
         realaccess = new RealInternetAccess(employeeName);  
         realaccess.grantInternetAccess();  
     }   
     else   
     {  
         System.out.println("No Internet access granted. Your job level is below 5");  
     }  
 }  
 public int getRole(String emplName) {  
 
     return 9;  
 }  
}  

public class ProxyPattern {
	  public static void main(String[] args)   
	    {  
	        OfficeInternetAccess access = new ProxyInternetAccess("Munnaf Koilakuntla");  
	        access.grantInternetAccess();  
	    }  

}
