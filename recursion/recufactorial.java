package recursion;

public class recufactorial {
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;

        }

        int num = factorial(n - 1);
        int fact_n = n * num;
        return fact_n;

    }

    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);

    }

}
