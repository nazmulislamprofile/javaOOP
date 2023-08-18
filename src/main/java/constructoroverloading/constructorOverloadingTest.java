
package constructoroverloading;

/**
 *
 * @author pc
 */
public class constructorOverloadingTest {
    
    public static void main(String[] args){
        
        teacher teacher1 =new teacher();
        teacher teacher2 =new teacher("nazmul islam", 23);
        teacher teacher3 =new teacher("abrar", 7,8988);
        
        teacher1.display();
        teacher2.display();
        teacher3.display();
        
    }
    
}
