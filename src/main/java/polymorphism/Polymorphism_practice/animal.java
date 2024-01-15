package polymorphism.Polymorphism_practice;

public class animal {
    void eat(){
        System.out.println("eating food");
    }
}

class cow extends animal{
    @Override
    void eat(){
        System.out.println("eating grass");
    }
}

class babyCow extends animal{
    @Override
    void eat(){
        System.out.println("eating milk");
    }   
}

class test{
    public static void main(String[] args) {
            animal a1,a2,a3;
            a1=new animal();
            a2=new cow();
            a3=new babyCow();
        
            a1.eat();
            a2.eat();
            a3.eat();
        
        System.out.println("-----------");
        
        
        /*-----by array---- */
            animal[] a=new animal[3];
            a[0]=new animal();
            a[1]=new cow();
            a[2]=new babyCow();

            a[0].eat();
            a[1].eat();
            a[2].eat();
    }
}