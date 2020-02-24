package java8Assignment;

@FunctionalInterface
interface getEmployee{
    Employee getInstance(String name, int age, String city);
}

class Employee{

    String name;
    int age;
    String city;

    Employee(){

    }

    Employee(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString(){
        return "i am " + name+" of age "+age + " from " + city;
    }

}

public class Question4 {

    public static void main(String[] args) {

        getEmployee ge = Employee::new;

        Employee e1 = ge.getInstance("raghav", 22, "Vegas");

        System.out.println(
                e1.toString()
        );

    }
}
