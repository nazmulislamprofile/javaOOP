package javaInnerClass;

public class outer {

    static class Nested_Demo {
        public void my_Method() {
            System.out.println("this is a nested class");
        }
    }
public static void main(String[] args) {
   outer.Nested_Demo nested =new outer.Nested_Demo();
   nested.my_Method();
}
}
