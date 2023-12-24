package atm;
import java.util.Scanner;
public class atm {
    int pin=1234;
    float balance;
    public void checkpin(){
        System.out.println("please enter your pin");
        Scanner  sc=new Scanner(System.in);
        int enteredPin=sc.nextInt();
        if(enteredPin==pin){
            menu();
        }
        else{
            System.out.println("please enter right pin");
        }
    }   
    
    public void menu(){
        System.out.println("welcome");
    }


}
