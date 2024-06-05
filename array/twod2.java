import java.util.*;

public class twod2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // array
        int[][] numbers = new int[rows][cols];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (numbers[i][j] == x) {
                    System.out.println("found at(" + i + ", " + j + ")");

                }
            }
        }

    }

}
