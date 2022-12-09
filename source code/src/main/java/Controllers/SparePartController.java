package Controllers;
import Models.SparePart;

public class SparePartController {
   SparePart sp;
   
   public SparePart addSparePart(){
       sp=new SparePart();
       return sp;
   }
}
