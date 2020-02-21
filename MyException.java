package exercise2;

public class MyException extends Exception{

    public MyException(String s){
        super(s);
    }

    public Throwable fillInStackTrace(){
        return this;
    }

    public static void main(String[] args) {

        try{
            throw new MyException("testing exception");
        }

        catch(MyException ex){
            ex.printStackTrace();
        }
    }
}
