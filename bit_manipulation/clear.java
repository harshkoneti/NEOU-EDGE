public class clear {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;
        int notnumber = ~bitmask;
        int newnumb = notnumber & n;

        System.out.println(newnumb);

    }
}