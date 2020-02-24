package java8Assignment;

@FunctionalInterface
interface MyInterface5{
    int sum(int a, int b);
}


public class Question2 {

    public static void main(String[] args) {

        MyInterface5 mi5 = (a,b)->a+b;
        System.out.println(mi5.sum(5,6));
    }
}
