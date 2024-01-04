package Program_Armstrong_number;
import java.lang.Math;
import java.util.Scanner;
public class armstrongNumber {
    public static boolean isArmstrong(int n) {
        int temp, last, digit = 0,sum=0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }

        temp=n;
        while (temp>0) {
            last=temp%10;
            sum +=(Math.pow(last, digit));   
            temp=temp/10;    
        }

        if (sum==n) {
            return true;
        }
        else{
            return false;
        }
        

    }

    public static void main(String[] args) {


            Scanner s=new Scanner(System.in);
            System.out.println("please enter the limit");
            int n=s.nextInt();
            System.out.println("Armstrong number of "+n+" are");
            for (int i = 0; i<=n; i++) {
                if (isArmstrong(i)) {
                    System.out.print(i+",");
                }
            }
        
    }

}
