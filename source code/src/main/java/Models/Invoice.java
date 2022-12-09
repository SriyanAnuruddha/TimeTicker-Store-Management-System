package Models;

public class Invoice {
    private int invoiceId;
    private String date;
    private String itemName;
    private double unitPrice;
    private int qty;
    private String cusName;
    private String cusAddress;
    private String cusEmail;
    private double subTotal=0;
    private double total=0;

    public Invoice(){
        
    }
    
    
    public Invoice(int invoiceId, String date, String itemName, double unitPrice, int qty, String cusName, String cusAddress, String cusEmail) {
        this.invoiceId = invoiceId;
        this.date = date;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.cusEmail = cusEmail;
    }

   

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
    
    //methods
    public double total(double unitPrice,int qty){
        return unitPrice*qty;
    }

   
    
    
}
