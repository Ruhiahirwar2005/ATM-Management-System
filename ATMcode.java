import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Welcome to ATM");
        System.out.println("Enter PIN");
        int pin =sc.nextInt();
        int balance=10000;
        int deposit=0;
        int Withdrawl =0;
        if (pin ==1234){
        System.out.println("Select any one option");
        System.out.println("Check Your Balance--> Press 1");
        System.out.println("Deposit Money--> Press 2");
        System.out.println("Withdrawl Money--> Press 3");
           System.out.print("Press Valid Option:");
           int opt = sc.nextInt();
        if (opt==1){
            System.out.println("Balance is : "+ balance);
        }
          else if (opt==2){
            System.out.println("Enter Amount:");
            int dep = sc.nextInt();
            balance =balance + dep;
            System.out.println("Balance is :"+(balance));
        }
         else {
            System.out.println("Enter Amount:");
            int with = sc.nextInt();
            balance =balance - with;
            System.out.println("Remaining Balance is :"+(balance));
        } 
    }
      else{
        System.out.println(" Incorrect PIN");
    }      
    }
}