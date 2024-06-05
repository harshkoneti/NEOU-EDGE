import java.util.*;

public class pta1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();

        int[] array = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            array[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println(" found at" + i);

            }
            ;

        }

    }
}
