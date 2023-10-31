package Almacen;

public class ProductoNoEncontradoException extends Exception{

    private String msg = "El producto que busca no se encuentra en nuestro almacén.";

    public ProductoNoEncontradoException() {
    }

    @Override
    public String toString() {
        return "ProductoNoEncontradoException{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
