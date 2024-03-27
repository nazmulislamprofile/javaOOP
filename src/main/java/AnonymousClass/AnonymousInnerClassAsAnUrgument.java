package AnonymousClass;
abstract class Engine{
    public abstract void engineType();
}
class vehicle{
    public void transport(Engine e){
        e.engineType();        
    }
}
public class AnonymousInnerClassAsAnUrgument {
    public static void main(String[] args) {
        vehicle v1=new vehicle();
        v1.transport(new Engine() {
            public void engineType(){
                System.out.println("turbo engine");
            }
        });
    }
}
