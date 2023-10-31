package Poligonos;

public class IllegalLadoSize extends Exception{

    private String msg = "Longitud del lado inválida";

    public IllegalLadoSize(){
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "IllegalLadoSize{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
