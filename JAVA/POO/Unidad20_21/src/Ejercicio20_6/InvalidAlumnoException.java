package Ejercicio20_6;

public class InvalidAlumnoException extends Exception{

    private String msg;

    public InvalidAlumnoException(){
        this.msg = "Inexistent object Alumno";
    }

    @Override
    public String toString() {
        return "InvalidAlumnoException{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
