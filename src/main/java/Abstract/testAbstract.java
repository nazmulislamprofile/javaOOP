package Abstract;

public abstract class testAbstract {
    abstract void display();
}

class test extends testAbstract{
    void display(){
        System.out.println("hello i am abstract method");
    }
}

 class testMain{
    public static void main(String[] args) {
        test obj=new test();
        obj.display();
    }
}