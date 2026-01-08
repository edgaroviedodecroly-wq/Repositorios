import java.util.StringJoiner;

public class Contacto {

    private String nombre;
    private String telefono;

    //Constructores


    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    boolean addContacto(Contacto c) {
        boolean result = true;
        boolean validar = false;

        //comprobar si existe
        if (c != null){

        }






        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contacto" + "\n");
        sb.append("nombre: ").append(nombre).append("\n");
        sb.append("telefono: ").append(telefono).append("\n");
        return sb.toString();
    }
}

