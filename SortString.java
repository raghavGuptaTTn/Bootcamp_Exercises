package exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        String s = "raghav";

        // convert string to char array
        char arr[] = s.toCharArray();

        // sort the char array
        for(int i=0; i<arr.length-1; i++){
            char min = arr[i];
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    minIndex = j;
                }
            }
            char temp;
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // convert array back to string
        s = String.valueOf(arr);
        System.out.println(s);

    }
}
