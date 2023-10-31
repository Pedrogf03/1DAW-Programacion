package Ejercicio17_3;

public class InvalidIDCardException extends Exception{

    private String msg;
    public InvalidIDCardException(String msg){
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "InvalidIDCardException '" + msg + '\'';
    }
}
