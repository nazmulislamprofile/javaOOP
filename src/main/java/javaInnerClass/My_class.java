package javaInnerClass;

public class My_class {
    public void displayMessage(Message m){
        System.out.println(m.great()+" This is an example of anonymous inner class as an argument");

    }  

    public static void main(String[] args) {
        My_class obj=new My_class();
        obj.displayMessage(new Message(){
            public String great(){
                return "hello";
            }
        });
    }


}
