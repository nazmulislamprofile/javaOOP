
package Problem_solving;

public class rectangle extends shape {
    rectangle(double length, double width){
       super(length,width);
   }
   
   @Override
   void area(){
       double result=0.5*length*width;
      System.out.println("area of the rectangle"+result);
   }
}
