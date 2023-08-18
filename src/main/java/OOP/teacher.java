
package OOP;

/**
 *
 * @author pc
 */
public class teacher {
    String name;
    int age;
    int phoneNumber;
    
    void setInformation(String name,int age, int phoneNumber){
        this.name=name;
        this.age=age;
        this.phoneNumber=phoneNumber;
        
    }
    
   void display(){
       System.out.println("name ="+name);
       System.out.println("age ="+age);
       System.out.println("phone Number="+phoneNumber);
       
   }
    
    
 }
