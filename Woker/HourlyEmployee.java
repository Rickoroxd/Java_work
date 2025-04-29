//Jakkrapong Sunsalai
//6709616384
package Woker;
public class HourlyEmployee extends Employee{
    private int workingSessionsPerMonth;
    private final int MIN_HOURLY_WAGE_RATE = 50 ;
    private final int HOUR = 8;
    public HourlyEmployee(String name, int age_n, String deprt, int wrk_ses,int per_n){
        super(name, age_n, deprt, per_n);
        workingSessionsPerMonth = wrk_ses;
       
    }
    public int calculatePersonalHourlyWage(){
        if(getPerformanceScore() > 5){
            int all = getPerformanceScore() - 5;
            switch(all){
                case 1:return 55;
                case 2:return 60;
                case 3:return 65;
                case 4:return 70;
                case 5:return 75;
            }
        }
        return 50;
    }
    @Override
    public double getMonthlyPayment() {
        return calculatePersonalHourlyWage() * workingSessionsPerMonth * HOUR ;
    }

    
}
