package java8Assignment;

import org.w3c.dom.ls.LSOutput;

@FunctionalInterface
interface MyInterface6{
    int operation(int a, int b);
}

class Temp{
    public static int multiply(int a, int b){
        return a*b;
    }

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }
}

public class Question3 {

    public static void main(String[] args) {

        MyInterface6 mi6 = Temp::multiply;
        System.out.println(mi6.operation(5,6));

//        see, we can change in the same object also.
//        MyInterface6 mi7 = new Temp()::add;
        mi6 = new Temp()::add;
        System.out.println(mi6.operation(5,6));

//      we can do by creating new object also.
        MyInterface6 mi8 = new Temp()::subtract;
        System.out.println(mi8.operation(5,6));
    }
}
