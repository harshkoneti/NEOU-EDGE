public class set {
    public static void main(String[] args) {

        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;
        int newnumb = bitmask | n;
        System.out.println(newnumb);

        if ((bitmask | n) == 0) {
            System.out.println(" zero number");

        } else {
            System.out.println(" non zero number");
        }

    }

}
