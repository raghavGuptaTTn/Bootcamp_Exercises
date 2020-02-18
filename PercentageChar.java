public class PercentageChar {

    public static void main(String args[]){

        String s = "Raghav is a GOOD employee oof TTn. 5star h0te1. r@gh@v !$5000s0000";
        int up=0, lo=0, ot=0, num=0;
        for(int i=0; i<s.length(); i++){
            int ascii = (int)s.charAt(i);
            if(ascii>=65 && ascii<=90)
                up++;
            else if(ascii>=97 && ascii<=122)
                lo++;
            else if(ascii>=48 && ascii<=57)
                num++;
            else
                ot++;

        }
        int l = s.length();
        System.out.println(l);
        System.out.println("lowercase - " + lo + " - " +        ((double)lo/l)*100 +"%");
        System.out.println("uppercase - " + up + " - " +        ((double)up*100/l)*100 +"%");
        System.out.println("number - " + num + " - " +          ((double)num*100/l)*100 +"%");
        System.out.println("other characters - " + ot + " - " + ((double)ot*100/l)*100 +"%");
    }
}
