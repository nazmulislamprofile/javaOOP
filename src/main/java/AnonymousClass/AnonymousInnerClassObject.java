package AnonymousClass;

class car{
    public void engineType(){
        System.out.println("turbo engine");
    }
}

public class AnonymousInnerClassObject {
    public static void main(String[] args) {
        car c1=new car();
        c1.engineType();

        car c2=new car(){
            @Override
            public void engineType(){
                System.out.println("v2 engine");
            }
        };
        c2.engineType();

    }
}
