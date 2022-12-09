package Controllers;
import Models.RepairJob;

public class RepairJobController {
    RepairJob rj;
    
    public RepairJob addRepairJob(){
        rj=new RepairJob();
        return rj;
    }
    
}
