package recursion;

public class reccurnnumbers {
    public static void numbers(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        numbers(i + 1, n, sum);

    }

    public static void main(String[] args) {
        numbers(1, 5, 0);

    }

}
