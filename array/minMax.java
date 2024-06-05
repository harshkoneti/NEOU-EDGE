import java.util.*;

public class minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] minmax = new int[size];

        for (int i = 0; i < size; i++) {
            minmax[i] = sc.nextInt();
        }

        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        for (int i = 0; i < minmax.length; i++) {

            if (minmax[i] < Min) {
                Min = minmax[i];
            }
            if (minmax[i] > Max) {
                Max = minmax[i];
            }
        }
        System.out.println("min is" + Min);
        System.out.println("max is" + Max);

    }

}
