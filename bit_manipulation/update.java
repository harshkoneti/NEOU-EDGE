import java.util.*;

public class update {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;
        if (oper == 1) {

            int newnumb = bitmask | n;
            System.out.println(newnumb);

        } else {
            int newbitmask = ~bitmask;
            int number = newbitmask & n;
            System.out.println(number);
        }

    }

}
