package Program_palindrome_number;
import java.util.Scanner;
public class PalindromeNumberByMethod {

    static public int reversedNumber(int num) {
        int reversed = 0;     
        while (num > 0) {
            int r = num % 10;
            reversed = reversed*10 + r;
            num = num / 10;
        }
        return reversed;

    }

    static public int checkPalindrome(int num){
        int temp=num;
        if (reversedNumber(num)==temp) {
            System.out.println(num+ " is a palindrome number");
        }
        else{
            System.out.println(num+" is not a palindrome number");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner s=new Scanner(System.in);
        int num;
        num=s.nextInt();
        System.out.println("reversed number is "+reversedNumber(num));
        checkPalindrome(num);
    }

}
