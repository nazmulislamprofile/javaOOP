
package polymorphism;


public class rectangular extends shape {
    
    double length, width;
    
    rectangular(double length,double width){
        this.length=length;
        this.width=width;
        
    }
    
    @Override
    double area(){
        System.out.println("area of the rectangle");
        return length*width;
    }
    
}
