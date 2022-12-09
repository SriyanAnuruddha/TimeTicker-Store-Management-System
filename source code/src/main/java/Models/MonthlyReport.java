package Models;

public class MonthlyReport {
   private double TotalRevenue;
    private double TotalExpences;
    private double netIncome;

    public MonthlyReport() {
    }
    
    public double calcTotalRevenue(double totalWatchSales){
        TotalRevenue=totalWatchSales;
        return TotalRevenue;
    }
    
    public double calcTotalExpences(double totalSalaries,double totalPartsCost){
        TotalExpences=totalSalaries+totalPartsCost;
        return TotalExpences;
    }
        
    
    public double calcNetIncome(){
        netIncome=TotalRevenue-TotalExpences;
        return netIncome;
    }
}
