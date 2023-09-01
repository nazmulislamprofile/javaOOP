
package Problem_solving;

public class triangle extends shape {
    
   triangle(double length, double width){
       super(length,width);
   }
   
   @Override
   void area(){
       double result=length*width;
      System.out.println("area of the triangle"+result);
   }
    
}
