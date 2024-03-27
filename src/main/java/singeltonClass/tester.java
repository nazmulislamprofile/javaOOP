package singeltonClass;

class ClassicSingleton {
    private static ClassicSingleton instance = null;

    private ClassicSingleton() {

    }

    public static ClassicSingleton getInstance() {
        if (instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }

    protected void demoMethod() {
        System.out.println("demo method for singelton");
    }

}

public class tester {
    public static void main(String[] args) {
        ClassicSingleton tmp = ClassicSingleton.getInstance();
        tmp.demoMethod();
    }
    
}
