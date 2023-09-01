
package Problem_solving;


public class circle extends shape {
     circle(double r){
       super(r,r);
   }
   
   @Override
   void area(){
       double result=3.1416*length*width;
      System.out.println("area of the circle"+result);
   }
}
