package recursion;

public class rev {
    public static void revers(String str, int idx) {

        if (idx == str.length()) {
            return;
        }

        System.out.print(str.charAt(idx));
        revers(str, idx - 1);

    }

    public static void main(String[] args) {
        String str = "hello";
        revers(str, str.length() - 1);
    }

}
