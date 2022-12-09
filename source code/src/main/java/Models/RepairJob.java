package Models;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RepairJob {

    private int jobNo;
    private String jobName;
    private String issueDate;
    private String dueDate;
    private String currentState;
    
    
    public RepairJob() {
    }

    public RepairJob(int jobNo, String jobName, String issueDate, String dueDate, String currentState) {
        this.jobNo = jobNo;
        this.jobName = jobName;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.currentState = currentState;
    }
    
    
     public void sendEmail(String recepient,String jobName,String CustomerName){
        String emailSubject="Your Watch is Fixed!";
        String emailBody="Dear Mr/Mrs "+CustomerName+",\nwe completed your  "+jobName+".\nyou can visit to our shop in jaffna and collect it.\nThank You,\nTime Ticker (PVT).LTD";
        
        try {
            JavaMailUtil.sendMail(recepient,emailSubject,emailBody);
        } catch (Exception ex) {
            Logger.getLogger(SparePart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    

}
