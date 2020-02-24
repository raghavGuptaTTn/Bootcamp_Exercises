package java8Assignment;

interface Test{

    default public void introduce(){
        System.out.println("i am the test interface..... ");
    }

    public int square(int a);
}

public class Question7 implements Test{
    // implement abstract method of interface
    public int square(int a){
        return a*a;
    }

    // override default method
    public void introduce(){
        System.out.println("i have been implemented by Question6");
    }

    public static void main(String[] args) {

        Question7 q = new Question7();

        q.introduce();
        System.out.println(q.square(4));

    }
}
