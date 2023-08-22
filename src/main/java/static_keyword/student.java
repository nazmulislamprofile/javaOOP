
package static_keyword;


public class student {
    String name;
    int id;
    static String universityName= "city university";
    
   
    student(String name, int id){
        this.name=name;
        this.id=id;
        
    }
    
    void display(){
        System.out.println("name="+name);
        System.out.println("id="+id);
        System.out.println("university name="+universityName);
         
        
    }
    
    
    
}
