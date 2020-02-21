package exercise2;

class Test{
    public int x,y;
}

class Test2 implements Cloneable{
    int a, b;
    Test t = new Test();

    public Object clone() throws CloneNotSupportedException{
        Test2 c = (Test2)super.clone();
        c.t = new Test();
        return c;
    }
}
public class Cloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.t.x = 100;
        t1.t.y = 200;

        Test2 t2 = (Test2)t1.clone();

        t2.a = 1000;
        t2.t.x = 5000;
        System.out.println("data of t1 object - " + t1.a + " " + t1.b + " " + t1.t.x + " " + t1.t.y);
        System.out.println("data of t2 object - " + t2.a + " " + t2.b + " " + t2.t.x + " " + t2.t.y);
    }
}
