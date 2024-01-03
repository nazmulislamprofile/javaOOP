package Program_palindrome_number;

import java.util.Scanner;

public class palindromeNumber {

    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num, reversed = 0;
        while (num > 0) {
            int r;
            r = num % 10;
            reversed = (reversed * 10) + r;
            num = num / 10;
        }

        if (temp == reversed) {
            System.out.println("this is a palindrome number");
        } else {
            System.out.println("this is a not palindrome number");
        }

    }

}
