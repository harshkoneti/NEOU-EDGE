import java.util.*;

public class pt45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (button) {
            case 1:
                System.out.print(a + b + " add");

                break;

            case 2:
                System.out.println(a - b + " subtract");
                break;
            case 3:
                System.out.println(a * b + " multiply");
                break;
            case 4:
                System.out.println(a / b + " divide");
                break;

            default:
                System.out.println(" none");
                break;
        }
    }

}
