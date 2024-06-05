package recursion;

public class recurev {
    public static void stringrev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        stringrev(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "hello";
        stringrev(str, str.length() - 1);
    }

}
