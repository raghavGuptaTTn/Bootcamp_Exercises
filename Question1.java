package collectionsExercise;

/*
AIM -
Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator,
find the sum of the numbers in List.
*/

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question1{

    public static void main(String[] args) {

        List<Float> list = new ArrayList<>();
        
        list.add(1.112f);
        list.add(2.33f);
        list.add(4.55f);
        list.add(6.7778f);
        list.add(9.7576f);

        Iterator<Float> it = list.iterator();
        Float sum = 0f;
        while(it.hasNext()){
            Float val = it.next();
//            System.out.println(val);
            sum+=val;
        }

        System.out.println("sum = " + sum);



    }
}
