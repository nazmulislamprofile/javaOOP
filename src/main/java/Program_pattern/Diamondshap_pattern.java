package Program_pattern;

import java.util.Scanner;

public class Diamondshap_pattern{
    public static void main(String[] args) {
        int i, j, row, space=1;
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        space=row;
        for(j=1;j<=row;j++){
            for(i=1;i<=space;i++){
                System.out.print(" ");
            }
            space--;
            for(i=1;i<=2*j-1;i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        space=2;
        for(j=1;j<=row-1;j++){
            for(i=1;i<=space;i++){
                System.out.print(" ");
            }
            space++;
            for(i=1;i<=2*(row-j)-1;i++){
                System.out.print("*");
            }
            System.out.println("");
        }




    }
}






/*
public class Diamondshap_pattern {
    public static void main(String args[]) {
        int row, i, j, space = 1;
        System.out.print("Enter the number of rows you want to print: ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        space = row - 1;
        for (j = 1; j <= row; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= row - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (row - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
*/