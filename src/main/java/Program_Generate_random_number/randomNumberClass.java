package Program_Generate_random_number;
import java.util.Random;
import java.lang.Math;
public class randomNumberClass {
    


    public static void main(String[] args) {
        Random random=new Random();
        int x=random.nextInt(100);
        System.out.println(x);
    }
}
