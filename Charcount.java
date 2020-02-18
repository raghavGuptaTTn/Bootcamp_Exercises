public class Charcount {
    public static void main(String args[]){
        String s = "raghavGupta";

//        System.out.println(s.replace("a", ""));

        int ans = s.length() - s.replace("a", "").length();
        System.out.println(ans);
    }
}
