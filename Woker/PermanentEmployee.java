//Jakkrapong Sunsalai
//6709616384
package Woker;
public class PermanentEmployee extends Employee{
    private int salary;
    private int socialSecurityRemittance;
    private int workingSessionsPerMonth;
    private double discount;
    private int performanceScore;
    public PermanentEmployee(String name, int age_n, String deprt, int per_n , int sala_n) {
        super(name, age_n, deprt, per_n); 
        salary = sala_n;  
        performanceScore = per_n;
    }
    @Override
    public double getMonthlyPayment(){
        double n = salary * (5.0/100);
        double extra = 0;
        if(performanceScore >= 8){
            extra = salary * (3/100.0);
        }
        if(n >=750){
            discount = 750;
            return salary+extra - 750;
        }
        discount = n;
        return (salary+extra)-n;
    }
    public double get_discount(){
        return discount;
    }
    public int getSalary(){
        return salary;
    }
    public int get_socialSecurityRemittance(){
        return socialSecurityRemittance;
    }
    public int get_workingSessionsPerMonth(){
        return workingSessionsPerMonth;
    }
    
    public void set_salary(int n){
        salary = n;
    }
}
