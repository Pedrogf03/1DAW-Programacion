package biblioteca;

public class Libro extends Publicacion implements Prestable{

    private boolean prestado;

    public Libro(String isbn, String titulo, int fecha_publicacion){
        super(isbn, titulo, fecha_publicacion);
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void presta(){
        if(this.isPrestado()){
            System.out.println("Ese libro ya está prestado.");
        } else {
            this.setPrestado(true);
        }
    }
    public void devuelve(){
        if(this.isPrestado()){
            this.setPrestado(false);
        } else {
            System.out.println("Ese libro no esta prestado.");
        }
    }
    public boolean estaPrestado(){
        return this.isPrestado();
    }

    @Override
    public String toString(){

        String resultado;

        if(estaPrestado()){
            resultado = " (prestado)";
        } else {
            resultado = " (no prestado)";
        }

        return super.toString() + resultado;

    }

}
