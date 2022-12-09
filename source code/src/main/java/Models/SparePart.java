package Models;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SparePart {
    private String name;
    private double price;
    private int qty;
    private double totalCost;
    
    public SparePart(){
        
    }
           
           

    public SparePart(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    //methods
    
    public double clacTotalCost (int qty,double price){
        return qty*price;
    }
    
    
    
    
    public void sendEmail(String recepient,String partNames,String supplierName){
        String emailSubject="We are running out of supplies";
        String emailBody="Dear Mr/Mrs "+supplierName+",\n\nwe required some "+partNames+".\nplease deliver these item(s) to our shop in jaffna. \nThank You,\nTime Ticker (pvt).ltd";
        
        try {
            JavaMailUtil.sendMail(recepient,emailSubject,emailBody);
        } catch (Exception ex) {
            Logger.getLogger(SparePart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         
}
