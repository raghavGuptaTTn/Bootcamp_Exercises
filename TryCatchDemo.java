package exercise2;

public class TryCatchDemo {

    public static void main(String[] args) {

        int a=5;
        int arr[] = {1,2,3,4,5};

        try{
//            int c = a/0;
            System.out.println(arr[7]);   // to understand better
        }
        catch(ArithmeticException ae){
            System.out.println("caught inside arithmetic exception specific catch");
            ae.printStackTrace();
        }
        catch(Exception e){
            System.out.println("caught inside generic catchh");
            e.printStackTrace();
        }
        finally{
            System.out.println("this is the final block");
        }
    }
}
