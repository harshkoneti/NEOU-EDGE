import java.util.*;

public class st2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lastname = sc.nextLine();

        String fullname = name + lastname; // concatenation
        System.out.println(name + lastname);

        System.out.println(fullname.length());

        for (int i = 0; i < fullname.length(); i++) { // charAt prints each individual items
            System.out.println(fullname.charAt(i));
        }

    }

}
