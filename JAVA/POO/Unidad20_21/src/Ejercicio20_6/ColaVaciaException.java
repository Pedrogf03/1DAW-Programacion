package Ejercicio20_6;

public class ColaVaciaException extends Exception{

    private final String msg = "La cola está vacía";

    public ColaVaciaException(){

    }

    @Override
    public String toString() {
        return "ColaVaciaException{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
