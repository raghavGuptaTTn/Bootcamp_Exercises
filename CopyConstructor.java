package exercise2;


class Test3{
    public int a, b;
    public Test t;

    Test3(){
        t = new Test();
    }

    Test3(Test3 temp){
        this.a = temp.a;
        this.b = temp.b;
        this.t = new Test();
        t.x = temp.t.x;
        t.y = temp.t.y;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        // set the values of t1 object
        Test3 t1 = new Test3();
        t1.a = 5;
        t1.b = 10;
        t1.t.x = 35;
        t1.t.y = 25;

        // copy this object into another object
        Test3 t2 = new Test3(t1);

        // modify a property of t2
        t2.t.x = 5000;

        // view both the objects to very deep copy
        System.out.println("data of t1 object - " + t1.a + " " + t1.b + " " + t1.t.x + " " + t1.t.y);
        System.out.println("data of t2 object - " + t2.a + " " + t2.b + " " + t2.t.x + " " + t2.t.y);


    }
}
