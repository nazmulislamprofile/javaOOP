package Program_reverse_number;

import java.util.Scanner;

public class ReverseNumberForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter any number for reverse number");
        int number = sc.nextInt();
        int reverse = 0;
        int temp = number;
        for (; number != 0; number = number / 10) {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
        }
        System.out.println(temp + " reverse number is " + reverse);
    }
}
