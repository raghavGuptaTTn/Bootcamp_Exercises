package java8Assignment;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question5 {
    public static void main(String[] args) {

        System.out.println(" ---- Consumer ----");
        Consumer<Integer> con = a->System.out.println(a);
        con.accept(5);

        System.out.println("---- Supplier ----");
        Supplier supp = ()->{
            Random random = new Random();
            return random.nextInt(1000);
        };
        System.out.println(supp.get());

        System.out.println("---- Predicate ----");
        Predicate<Integer> pred = a->a>0;
        System.out.println(pred.test(7));
        System.out.println(pred.test(-4));

        System.out.println("---- Function ----");
        Function<String, Integer> func = (a)->a.length();
        int value = func.apply("raghav gupta");
        System.out.println(value);
    }
}
