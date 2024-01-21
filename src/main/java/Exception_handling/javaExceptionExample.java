package Exception_handling;

public class javaExceptionExample {
    public static void main(String[] args) {

        try {
            int div;
            div = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("exception handled");
        }

        System.out.println("this is successfull");
    }

}
