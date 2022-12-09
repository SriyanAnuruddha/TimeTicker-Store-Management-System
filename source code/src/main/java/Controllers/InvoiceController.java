package Controllers;
import Models.Invoice;


public class InvoiceController {
    Invoice invoiceObj;
    
    
    public Invoice addInvoice(int invoiceId, String date, String itemName, double unitPrice, int qty, String cusName, String cusAddress, String cusEmail){
        invoiceObj=new Invoice(  invoiceId,  date,  itemName,  unitPrice,  qty,  cusName,  cusAddress,  cusEmail);
        
        return invoiceObj;
    }
    
    public Invoice addInvoice(){
        invoiceObj=new Invoice( );        
        return invoiceObj;
    }
    
}
