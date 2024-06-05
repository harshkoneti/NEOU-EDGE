public class stb1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony"); // Stringbuilder are used to vreate a mutable or modify character
        // set char

        // sb.setCharAt(2, 'j');
        // System.out.println(sb);

        sb.insert(1, 'n');
        System.out.println(sb);

        sb.delete(1, 2);
        System.out.println(sb);

        sb.append("y");
        System.out.println(sb);
    }

}
