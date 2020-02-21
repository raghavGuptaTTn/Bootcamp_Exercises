package exercise2;

import java.util.Scanner;

public class DoneToken {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean status;
//        while(sc.hasNext()){
//            status = false;
//            String word = sc.next();
//
//            if(word.toLowerCase().equals("done")){
//                break;
//            }
//
//            if(word.charAt(0) == word.charAt(word.length()-1))
//                status = true;
//            System.out.println(word + " - " + status);
//        }

        do{
            status = false;
            String word = sc.next();

            if(word.toLowerCase().equals("done")){
                break;
            }

            if(word.charAt(0) == word.charAt(word.length()-1))
                status = true;
            System.out.println(word + " - " + status);

        }while(sc.hasNext());

        sc.close();
    }
}
