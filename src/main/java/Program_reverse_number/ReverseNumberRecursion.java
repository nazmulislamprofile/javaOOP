package Program_reverse_number;

import java.util.Scanner;

public class ReverseNumberRecursion {

    public static void revreseNumber(int num) {
        if(num<10){
            System.out.println(num);
        }
        else{
            System.out.print(num%10);
            revreseNumber(num/10);
        }
    }

    public static void main(String[] args) {
        revreseNumber(9);
    }
}

/*
 * public class ReverseNumberRecursion {
 * // method for reverse a number
 * public static void reverseNumber(int number) {
 * if (number < 10) {
 * // prints the same number if the number is less than 10
 * System.out.println(number);
 * return;
 * } else {
 * System.out.print(number % 10);
 * reverseNumber(number / 10);
 * }
 * }
 * 
 * public static void main(String args[]) {
 * System.out.print("Enter the number that you want to reverse: ");
 * Scanner sc = new Scanner(System.in);
 * int num = sc.nextInt();
 * System.out.print("The reverse of the given number is: ");
 * // method calling
 * reverseNumber(num);
 * }
 * }
 */