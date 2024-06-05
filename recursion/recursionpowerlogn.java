package recursion;

public class recursionpowerlogn {

    public static int Calcpow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return Calcpow(x, n / 2) * Calcpow(x, n / 2);
        } else {
            return Calcpow(x, n / 2) * Calcpow(x, n / 2) * x;
        }

    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = Calcpow(x, n);
        System.out.println(ans);

    }

}
