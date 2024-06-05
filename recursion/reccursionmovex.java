package recursion;

public class reccursionmovex {
    public static void movex(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;

        }

        char curchar = str.charAt(idx);
        if (curchar == 'x') {
            count++;
            movex(str, idx + 1, count, newString);
        }

        else {
            newString += curchar;
            movex(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        movex(str, 0, 0, "");
    }

}
