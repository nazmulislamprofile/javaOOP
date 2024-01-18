package Program_pattern;

import java.util.Scanner;

public class Mirrored_Right_Triangle_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int i,j,space=row;

        for(j=1;j<=row;j++){
            for(i=1;i<=space;i++){
                System.out.print(" ");
            }
            space--;
            for(i=1;i<=j;i++){
                System.out.print("*");
            }
            System.out.println("");

        }


    }
}
