
package Models;

public class Employee {
   private int empID;
   private String empName;
   private double rate;
   private int hoursWorked;
   private double Salary;

    public Employee(int empID, String empName, double rate, int hoursWorked) {
        this.empID = empID;
        this.empName = empName;
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public Employee() {
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
   
    
    public double  calculateSalary(double CurrentSalary,double rate,int hoursWorked){
         CurrentSalary+=(rate*hoursWorked);
         return CurrentSalary;
    }
   
   
   
}
