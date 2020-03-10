package Structural;
interface ActionListenerCommand {  
    public void execute();  
}  
class Document {  
    public void open(){  
     System.out.println("Document Opened");  
 }  
 public void save(){  
     System.out.println("Document Saved");  
 }  
}  
class ActionOpen implements ActionListenerCommand{  
    private Document doc;  
    public ActionOpen(Document doc) {  
        this.doc = doc;  
    }  
 
    public void execute() {  
        doc.open();  
    }  
}
class MenuOptions implements ActionListenerCommand{  
   // private Document doc;  
    public MenuOptions(ActionListenerCommand clickOpen,ActionListenerCommand clickSave) {  
        //this.doc=doc;  
    }  
 
    public void clickOpen() {  
       // doc.open();  
    	System.out.println("the Document Opened");
    	
    }  
    public void clickSave() {  
       // doc.open(); 
    	System.out.println("the Document Saved");
    }

	public void execute() {
		// TODO Auto-generated method stub
		
		
		
	} 
}
class ActionSave implements ActionListenerCommand{  
	   private Document doc;  
	   public ActionSave(Document doc) {  
	        this.doc = doc;  
	    }  
	    
	    public void execute() {  
	        doc.save();  
	    }  
	}  

public class Command {
	  public static void main(String[] args) {  
	        Document doc = new Document();  
	          
	        ActionListenerCommand clickOpen = new ActionOpen(doc);  
	        ActionListenerCommand clickSave = new ActionSave(doc);  
	          
	        MenuOptions menu = new MenuOptions(clickOpen, clickSave);  
	          
	        menu.clickOpen();  
	        menu.clickSave();  
	        
	   }  

}
