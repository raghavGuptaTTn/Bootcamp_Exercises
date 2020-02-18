public class Reverse {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("determination");
        System.out.println("original string - " + s);

        s.reverse();
        System.out.println("reversed string - " + s);

        s.replace(4, 10, "");
        System.out.println("after removing the characters - " + s);
    }
}
