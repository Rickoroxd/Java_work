//Jakkrapong Sunsalai
//6709616384
package Woker;

public abstract  class Employee {
    private String fullName ;
    private int age;
    private String deapartment;
    private int performanceScore = 0;
    private int count_name_surname = 0 ;

    //Constructor
    public Employee(String name,int age_n,String deprt,int per_n){
        fullName = name;
        age = age_n;
        deapartment =deprt;
        performanceScore = per_n;
    }
    //setter
    public void set_fullName(String name){
        fullName = name;
    }
    public void set_Age(int n){
        age = n;
    }
    public void set_department(String depart){
        deapartment = depart;
    }
    public void  set_performanceScore(int n){
        performanceScore = n;
    }


    //getter
    public String getFullName(){
        return fullName;
    }
    public int getAge(){
        return age;
    }
    public String getDepartment(){
        return deapartment;
    }
    public int getPerformanceScore(){
        return performanceScore;
    }
    abstract double getMonthlyPayment();
    
    public String getName(){
        String name="";
        for(int i=0;i!=fullName.length()-1;i++){
            if(fullName.charAt(i) =='-'){
                break;
            }
            name+=fullName.charAt(i);
            count_name_surname++;
        }
        return name;
    }
    public String getLastName(){
        String surname="";
        for(int i=count_name_surname+1;i<fullName.length();i++){
            surname+=fullName.charAt(i);
        }
        return surname;
    }
   
}
