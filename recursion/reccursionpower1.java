package recursion;

public class reccursionpower1 {

    public static int calcpower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpown1 = calcpower(x, n - 1);
        int xpown = x * xpown1;
        return xpown;
    }

    public static void main(String[] args) {
        int n = 5;
        int x = 2;
        int ans = calcpower(x, n);
        System.out.println(ans);

    }

}
