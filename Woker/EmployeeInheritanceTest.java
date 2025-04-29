//Jakkrapong Sunsalai
//6709616384
package Woker;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class EmployeeInheritanceTest {
   public static void main(String[] args){
      ArrayList<Employee> all= new ArrayList<>();
      PermanentEmployee P1 = new PermanentEmployee("Somchai-Hankla", 25, "IT", 8,20000);
      PermanentEmployee P2 = new PermanentEmployee("Somsong-Bunthum", 22, "IT", 4, 12000);
      
      HourlyEmployee H1 = new HourlyEmployee("Manee-Dumkum", 21, "Production", 25,6);
      HourlyEmployee H2 = new HourlyEmployee("Piti-Rukthai", 25, "Production", 30, 5);
      HourlyEmployee H3 = new HourlyEmployee("Veera-Rukdee", 30, "Production", 20, 8);
      all.add(P1);
      all.add(P2);
      all.add(H1);
      all.add(H2);
      all.add(H3);
      printMonthlyPaymentSlip(all);
   }
   public static void printMonthlyPaymentSlip(ArrayList<Employee> all){
      for(Employee i:all){
         System.out.println("************************************************");
         System.out.println("\t Payment Slip of " + i.getFullName() );
         System.out.println("************************************************");

         System.out.println("First Name : "+i.getName()+"\t"+"Last Name : "+i.getLastName());
         System.out.println("Department : "+i.getDepartment() + "\t\t" + "Age : " + i.getAge());
         if( i instanceof PermanentEmployee){
            System.out.print("Monthly Payment : " + (int)i.getMonthlyPayment() + " baht ");
            double n = ((PermanentEmployee) i).get_discount();
            System.out.printf("Social Security : %.2f baht \n\n\n", n);
         }
         else{
            System.out.print("Monthly Payment : " + (int)i.getMonthlyPayment() + " baht \n\n\n");
         }
        
         
        
      }
      
   }
}
