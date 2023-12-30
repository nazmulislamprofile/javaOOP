package array;

public class Two_dimentional_array {
    public static void main(String[] args) {
        
        int [] [] TDMA= {{1,2,3,4,5,6,7,8},
                    {9,10,11,12,13,14,15,16},
                    {17,18,19,20,21,22,23,24}
                    };
        
         for(int i=0;i<TDMA.length;i++) {
            for(int j=0;j<TDMA[i].length;j++){
                
                System.out.print(TDMA[i][j]+" ");
            }
            System.out.println("\n");
         }       
         
         //for each
         System.out.println("for each loop");

         for(int [] row:TDMA){
                for(int col:row){
                    System.out.print(col+" ");
                }
                System.out.println("\n");
         }




    }

}
