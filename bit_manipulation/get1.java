public class get1 {

    public static void main(String[] args) {

        int n = 5;
        int pos = 3;
        int bitmask = 1 << pos;

        if ((bitmask & n) == 0) {
            System.out.println("zero number");

        } else {
            System.out.println(" non zero number");
        }
    }
}