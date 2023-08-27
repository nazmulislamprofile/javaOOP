
package super_keyword;


public class car extends vehicale {
    int gear;
    
    car(String name, int weight, int gear){
        super(name,weight);
        this.gear=gear;
        
      }

    @Override
    void attribute(){
        super.attribute();
        System.out.println("gear="+gear);
    }
    
}
