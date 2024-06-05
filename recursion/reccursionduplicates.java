package recursion;

public class reccursionduplicates {
    public static boolean[] map = new boolean[26];

    public static void recedup(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;

        }

        char currchar = str.charAt(idx);
        if (map[currchar - 'a']) {
            recedup(str, idx + 1, newString);
        } else {
            map[currchar - 'a'] = true;
            newString += currchar;
            recedup(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "aabbccdd";
        recedup(str, 0, "");

    }

}
