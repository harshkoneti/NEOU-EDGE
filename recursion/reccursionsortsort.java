package recursion;

public class reccursionsortsort {
    public static int recf(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int nm1 = recf(n - 1);
        int nm = n * nm1;
        return nm;

    }

    public static void main(String[] args) {
        int n = 5;
        int ans = recf(n);
        System.out.println(ans);

    }

}
