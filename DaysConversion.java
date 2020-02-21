package exercise2;

import java.util.Scanner;

public class DaysConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input the seconds value
        int temp = sc.nextInt();

        // generate spare seconds [which will be less than 60 always]
        int seconds = temp%60;

        // get the spare minutes [less than 60 always]
        temp = temp/60;
        int minutes = temp%60;

        // get the spare hours
        temp/=60;
        int hours = temp%24;

        // now only days are left.
        temp/=24;
        int days = temp;

        System.out.println("the time is: ");
        System.out.print(days + "days ");
        System.out.print(hours + "hours ");
        System.out.print(minutes + "minutes ");
        System.out.print(seconds + "seconds ");

        sc.close();
    }
}
