package Progrm_primeNumber;

public class PrimeNumberOne {
    public static void main(String[] args) {
        int n, m;
        n = 12;
        m = n / 2;
        boolean flag;
        flag = false;

        if (n == 0 || n == 1) {
            System.out.println(n + "is prime number");
        }
         else {
            for (int i = 2; i < m; i++) {
                if (n % i == 0) {
                    System.out.println(n + "is not prime number");
                    flag = true;
                    break;
                }
                if (!flag) {
                    System.out.println(n + "is prime number");
                }

            }
        }

    }
}
