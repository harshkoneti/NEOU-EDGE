import java.util.*;

public class twodarray1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                // System.out.print(numbers[i][j]);
                numbers[i][j] = sc.nextInt();
            }
            // System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}