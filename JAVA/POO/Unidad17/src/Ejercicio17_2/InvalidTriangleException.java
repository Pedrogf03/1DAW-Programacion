package Ejercicio17_2;

public class InvalidTriangleException extends Exception{

    private String msg = "Invalid triangle size";
    public InvalidTriangleException(){
        super();
    }

    @Override
    public String toString() {
        return "InvalidTriangleException '" + msg + '\'';
    }
}
