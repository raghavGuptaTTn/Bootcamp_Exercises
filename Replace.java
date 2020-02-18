public class Replace{
    public static void main(String []args){
        String s = "the sun rises in the east";
        System.out.println("original string - " + s);

        System.out.println("modified string - " + s.replaceAll("the", "new"));
    }
}
