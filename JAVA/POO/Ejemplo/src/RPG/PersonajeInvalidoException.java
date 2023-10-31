package RPG;

public class PersonajeInvalidoException extends Exception{

    private String mensaje;

    public PersonajeInvalidoException(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "PersonajeInvalidoException{" + "mensaje='" + mensaje + '\'' + '}';
    }
}
