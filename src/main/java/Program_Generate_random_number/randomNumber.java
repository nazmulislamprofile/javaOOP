package Program_Generate_random_number;
import java.lang.Math;
public class randomNumber {
    public static void main(String[] args) {
        int min,max;
        min=200;
        max=400;
        System.out.println((int)(Math.random()*((max-min+1)+min)));
    }
}
