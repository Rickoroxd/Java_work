package Bakerry;

import java.util.Scanner;
public class Main{
    public static String Status_all(int l){
        if(l==1){
            return "Burn";
        }
        else if(l==2){
           return "Crisp";
        }
        else if(l==3){
            return "Soft";
        }
        return "Soft" ; 
    }
    public static void main(String[] args){
        Toaster toaster = new Toaster();
        Scanner input = new Scanner(System.in);
        String level = null;
        System.out.println("How many all Bread and Cookie do you want");
        int n = input.nextInt();
        if(n==0){
            System.out.println("Bro,You don't want anything why you come here man!!!");
        }
        for(int i=0;i<n;i++){
            System.out.println("For "+ (int)(i+1));
            System.out.println("1.Bread \n2.Cookie\n\n");
            System.out.println("Pls Enter number 1-2\n\n");
            int x = input.nextInt();
            if(x!=1 && x!=2){
                System.out.println("Only Bread and Cookie Bro.");
                System.out.println("Fill again");
                break;
            }
            System.out.println("Set state of Cookie ");
            System.out.println("1.Burn\n2.Crisp\n3.Soft");
            int l = input.nextInt();
            
            if(x==1){
                Bread b = new Bread();
                b.setState(Status_all(l));
                toaster.add((Toastable)b);
            }
            else if(x==2){
                Cookie c = new Cookie();
                c.setState(Status_all(l));
                toaster.add((Toastable)c);
            }                   
        }
        toaster.print();
    }
}
