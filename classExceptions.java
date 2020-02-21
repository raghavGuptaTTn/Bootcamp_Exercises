package exercise2;

public class classExceptions {
    public static void main(String[] args){
        try{
            Class.forName("Tothenew");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
