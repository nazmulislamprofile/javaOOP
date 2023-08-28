
package polymorphism;

public class test {
    public static void main(String[] args) {
        
       shape[] s=new shape[3];
        
        s[0] =new shape();
        s[1]=new rectangular(5,2);
        s[2]=new triangle(2,3);
         
        
        System.out.println(s[0].area());
        System.out.println(s[1].area());
        System.out.println(s[2].area());
       
        
    }
            
}
