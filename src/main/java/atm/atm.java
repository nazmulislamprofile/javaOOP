package atm;
import java.util.Scanner;
public class atm {
    int pin=1234;
    float balance;
    float amount;
    public void checkpin(){
        System.out.println("please enter your pin");
        Scanner  sc=new Scanner(System.in);
        int enteredPin=sc.nextInt();
        if(enteredPin==pin){
            menu();
        }
        else{
            System.out.println("please enter right pin");
            enteredPin=sc.nextInt();
            if(enteredPin==pin){
                menu();
            }
            
        }
    }   
    
    public void menu(){
        System.out.println("welcome");
        System.out.println("Please select your Option\n");
        System.out.println("-----------------------\n");
        System.out.println("1. Balance Enquiry");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner opt=new Scanner(System.in);
         int choiceOpt=opt.nextInt();
         
         if(choiceOpt==1){
            checkBalance();
         }

         else if (choiceOpt==2) {
            WithdrawMoney();
         }

         else if(choiceOpt==3){
            DepositMoney();
         }

         else{
            menu();
         }
         
       
         

    }

    public void checkBalance(){
        System.out.println("your account balance:"+balance);
        menu();
    }


    public void WithdrawMoney(){
        System.out.println("please enter withdraw money amount");
        Scanner  withdrawAmount=new Scanner(System.in);
         amount=withdrawAmount.nextFloat();

         if(amount>balance){
            System.out.println("insufficient balance");
         }
         else{
            balance=balance-amount;
            System.out.println("money withdraw successfully");
         }

         menu();
    }

    public void DepositMoney(){
        System.out.println("please enter your deposit amount");
        Scanner depositAmount=new Scanner(System.in);
        float amount=depositAmount.nextFloat();
        balance=balance+amount;
        System.out.println("Thanks, money deposit successfull");
        menu();
    }
}
