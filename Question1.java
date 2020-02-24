package java8Assignment;

// part A
@FunctionalInterface
interface MyInterface1{
    boolean compare(int a, int b);
}

// part B
@FunctionalInterface
interface MyInterface2{
    int increment(int a);
}

// part C
@FunctionalInterface
interface MyInterface3{
    String concat(String a, String b);
}

// part D
@FunctionalInterface
interface MyInterface4{
    String toUpper(String s);
}



public class Question1{

    public static void main(String[] args) {

        System.out.println("part A ---- ");

        MyInterface1 mi1 = (a,b)->a>b;

        System.out.println( mi1.compare(5,6) );
        System.out.println( mi1.compare(6,5) );
        System.out.println();


        System.out.println("part B ---- ");

        MyInterface2 mi2 = (a)->a+1;

        System.out.println( mi2.increment(10));
        System.out.println();


        System.out.println("part C ---- ");

        MyInterface3 mi3 = (a,b)->a+b;

        System.out.println( mi3.concat("raghav ", "gupta") );
        System.out.println( mi3.concat("mohit ", "gupta") );
        System.out.println();


        System.out.println("part D ---- ");

        MyInterface4 mi4 = (a)->a.toUpperCase();

        System.out.println( mi4.toUpper("raghav") );
        System.out.println();

    }
}
