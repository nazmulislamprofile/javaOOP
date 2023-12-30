package array;

public class multi_dimentional_array {
    public static void main(String[] args) {

        // int [][][] MDMA=new int[50][50][50];
        int[][][] MDMA = {
                {
                        { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 }
                },
                {
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 }
                }

        };

        // for (int i = 0; i < MDMA.length; i++) {
        //     for (int j = 0; j < MDMA[i].length; j++) {
        //         for (int k = 0; k < MDMA[k].length; k++) {
        //             System.out.print(k);
        //         }
        //     }
        // }

        // for each loop

        for(int [][] row:MDMA){
            for(int[] col:row){
                for(int data:col){
                    System.out.print(data+" ");
                }
            }
            System.out.println("\n");
        }


    }

}