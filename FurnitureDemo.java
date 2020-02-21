package exercise2;

abstract class Furniture{
    int cost;
    String brand;
    int numOfLegs;

    public abstract void stressTest();
    public abstract void fireTest();

    public void setDetails(int c, String b, int n){
        cost = c;
        brand = b;
        numOfLegs = n;
    }
    public void showDetails(){
        System.out.println("cost - " + cost);
        System.out.println("brand - " + brand);
        System.out.println("number of legs - " + numOfLegs);
    }
}

abstract class Chair extends Furniture {

    public abstract void getChairType();
}

abstract class Table extends Furniture {

    public abstract void getTableType();
}


class MetalChair extends Chair{
    public void stressTest(){
        System.out.println("stress testing performed on metal chair");
    }

    public void fireTest(){
        System.out.println("fire test performed on metal chair");
    }

    public void getChairType(){
        System.out.println("this is a metal chair");
    }

    @Override
    public void showDetails() {
        this.getChairType();
        super.showDetails();
    }
}


class WoodenChair extends Chair{
    public void stressTest(){
        System.out.println("stress testing performed on wooden chair");
    }

    public void fireTest(){
        System.out.println("fire test performed on wooden chair");
    }

    public void getChairType(){
        System.out.println("this is a wooden chair");
    }

    @Override
    public void showDetails() {
        this.getChairType();
        super.showDetails();
    }
}


class MetalTable extends Table{
    public void stressTest(){
        System.out.println("stress testing performed on metal table");
    }

    public void fireTest(){
        System.out.println("fire test performed on metal table");
    }

    public void getTableType(){
        System.out.println("this is a metal table");
    }

    @Override
    public void showDetails() {
        this.getTableType();
        super.showDetails();
    }
}


class WoodenTable extends Table{
    public void stressTest(){
        System.out.println("stress testing performed on wooden table");
    }

    public void fireTest(){
        System.out.println("fire test performed on wooden table");
    }

    public void getTableType(){
        System.out.println("this is a wooden table");
    }

    @Override
    public void showDetails() {
        this.getTableType();
        super.showDetails();
    }
}




public class FurnitureDemo {

    public static void main(String[] args) {

        WoodenChair wc = new WoodenChair();
        wc.setDetails(1500, "manhatton", 4);
        wc.showDetails();

        System.out.println("----------------");


        MetalChair mc = new MetalChair();
        mc.setDetails(2000, "godrej", 3);
        mc.showDetails();

        System.out.println("----------------");

        WoodenTable wt = new WoodenTable();
        wt.setDetails(10000, "manhatton", 4);
        wt.showDetails();

        System.out.println("----------------");

        MetalTable mt = new MetalTable();
        mt.setDetails(15000, "godrej", 6);
        mt.showDetails();

        System.out.println("----------------");

    }
}
