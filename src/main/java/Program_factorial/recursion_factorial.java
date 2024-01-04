package Program_factorial;

public class recursion_factorial {

  public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*(factorial(n-1));
        }
    }





    public static void main(String[] args) {
      int input=factorial(5);
      System.out.println("factorial of the number is "+input);
    }
}
