class Static {
    static int age = 20;

    static{
        System.out.println("First name - " + "Raghav");
    }

    static void printLastName(String lastName){
        System.out.println("last name - " + lastName);
    }

}

public class staticDemo{
    public static void main(String[] args) {
        System.out.println("age - " + Static.age);
        Static.printLastName("Gupta");
    }
}
