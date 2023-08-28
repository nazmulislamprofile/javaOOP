
package polymorphism;


public class triangle extends shape {
    double length,width;
        triangle(double length,double width){
            this.length=length;
            this.width=width;
           
        }
        
    @Override
        double area(){
            System.out.println("area of the triangle");
            return 0.5*length*width;
        }
    
    
}
