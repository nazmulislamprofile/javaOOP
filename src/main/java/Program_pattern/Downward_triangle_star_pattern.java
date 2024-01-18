package Program_pattern;

import java.util.Scanner;

public class Downward_triangle_star_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int i,j;
        for(j=0;j<=row;j++){
            for(i=0;i<=row-j;i++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
