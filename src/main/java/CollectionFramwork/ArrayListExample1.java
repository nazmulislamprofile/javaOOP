package CollectionFramwork;
import java.util.*;
public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        list.add("apple");
        list.add("mango");
        list.add("orange");
        list.add("banana");
    //    System.out.println(list);

        for(String fruit:list){
            System.out.println(fruit);
        }
        System.out.println("---------printing affer added jackfruit------------");
       // System.out.println(list.get(0));
        System.out.println(list.set(1,"Jackfruit"));
        for(String fruit:list){
            System.out.println(fruit);
        }

    }
}
