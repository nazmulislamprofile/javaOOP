package array;

public class testArray {
   public static void main(String[] args) {
      passinArraytoMethod.printArray(new int[] { 1, 2, 3, 4, 5 });
   }
}

class passinArraytoMethod {
   public static void printArray(int[] array) {
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
      }
   }
}
