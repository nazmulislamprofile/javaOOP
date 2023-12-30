package array;

public class one_dimentional_array {
   public static void main(String[] args) {
        String book[]; //array initilize
        book=new String[10]; //array size initilize
        book[0]="bangla";
        book[1]="english";
        book[2]="math";
        System.out.println("book name\n"+book[2]);

        //another way of array declare and initilize
        int number[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(number[2]);

         //another way of array declare and initilize
        String color[] =new String[10];
        color[1]="red";
        System.out.println(color[1]);

        

   } 
}
