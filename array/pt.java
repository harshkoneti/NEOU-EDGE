import java.util.*;

public class pt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        /// input
        int[] array = new int[size]; // array

        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        for (int i = 0; i < array.length; i++)
            if (array[i] == x) {
                System.out.println(" found at:" + i);

            }

    }

}
