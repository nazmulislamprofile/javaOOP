
package constructoroverloading;

/**
 *
 * @author pc
 */
public class teacher {
    String name;
    int age;
    int phoneNumber;
    
    teacher(){
        System.out.println("no data default constructor");
    }
    teacher(String name, int age){
        this.name=name;
        this.age=age;
    }
    
    teacher(String name, int age, int phoneNumber){
        this.name=name;
        this.age=age;
        this.phoneNumber=phoneNumber;
    }
    
    void display(){
        System.out.println("Name="+name );
        System.out.println("AGE="+age );
        System.out.println("Phone Number="+phoneNumber );
        System.out.println();
        
        
    }
    
}
