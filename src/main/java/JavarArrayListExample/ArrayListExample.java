package JavarArrayListExample;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
         fruits.add("mango");
         fruits.add("apple");
         fruits.add("orange");
        for(String fruit:fruits){
            System.out.println(fruit);
        }

        boolean containBanana=fruits.contains("Banana");
        System.out.println(containBanana);

        fruits.remove("apple");
        System.out.println("updated arrayList after removing from arraylist");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }

}
