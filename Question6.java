package java8Assignment;


interface TestInterface
{
    // abstract method
    default public int square(int a){
        return a*a;
    }

    // static method
    static void show()
    {
        System.out.println("Static Method Executed");
    }
}

class Question6 implements TestInterface
{

    public static void main(String args[])
    {
        Question6 q = new Question6();

        int result = q.square(4);
        System.out.println(result);

        // Static method executed
        TestInterface.show();
    }
}

