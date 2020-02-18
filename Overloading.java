public class Overloading {

    // overloaded add function
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }

    // overloaded mul function
    int mul(int a, int b){
        return a*b;
    }
    float mul(float a, float b){
        return a*b;
    }

    // overloaded concat function
    String concat(String a, String b){
        return a+b;
    }
    String concat(String a, String b, String c){
        return a+b+c;
    }


    public static void main(String[] args) {
        Overloading o = new Overloading();

        System.out.println(o.add(2,3));
        System.out.println(o.add(2.5768898,3.7897678));

        System.out.println(o.mul(2,3));
        float x=2.6f, y=3.5f;
        System.out.println(o.mul(x,y));

        System.out.println(o.concat("raghav", "gupta"));
        System.out.println(o.concat("raghav", " ", "gupta"));

    }
}
