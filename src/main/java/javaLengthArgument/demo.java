
package javaLengthArgument;

public class demo {
    
    void add(int ... num){
        int sum=0;
        for( int x:num){
            sum=sum+x;
        }
        System.out.println(sum);
    }
    
    
    
}
