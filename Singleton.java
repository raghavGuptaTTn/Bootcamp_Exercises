package exercise2;

public class Singleton {

    public static Singleton single_instance = null;

    public String s;

    private Singleton(){
        s = "raghav is an awwesome guy";
    }

    public static Singleton getInstance(){
        if(single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }

    public static void main(String[] args) {

        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        Singleton c = Singleton.getInstance();

        System.out.println(a.s);
        System.out.println(b.s);
        System.out.println(c.s);

        a.s = a.s.toUpperCase();

        System.out.println(a.s);
        System.out.println(b.s);
        System.out.println(c.s);

    }

}
