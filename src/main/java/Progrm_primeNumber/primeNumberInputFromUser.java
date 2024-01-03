package Progrm_primeNumber;

import java.util.Scanner;

public class primeNumberInputFromUser {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter a number");
        int n = s.nextInt();

        if (isNumber(n)) {
            System.out.println(n+ " is  a prime number");
        }
        else{
            System.out.println(n+ " is a not prime number");
        }

    }

    public static boolean isNumber(int n) {
        if (n < 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }

            }
        }
        return true;
    }

    // public static void main(String[] args) {
    // Scanner s = new Scanner(System.in);
    // System.out.print("Enter a number : ");
    // int n = s.nextInt();
    // if (isPrime(n)) {
    // System.out.println(n + " is a prime number");
    // } else {
    // System.out.println(n + " is not a prime number");
    // }
    // }

    // public static boolean isPrime(int n) {
    // if (n <= 1) {
    // return false;
    // }
    // for (int i = 2; i < Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }
}
