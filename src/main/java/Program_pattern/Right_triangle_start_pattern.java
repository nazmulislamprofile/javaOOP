package Program_pattern;

public class Right_triangle_start_pattern {

    public static void main(String[] args) {
        int row = 6;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
