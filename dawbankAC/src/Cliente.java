import java.time.format.DateTimeFormatter;

public class Cliente extends Persona {
    private String numeroTelefono;
    private String direccion;
    private String email;


    public Cliente(String nombre, String DNI, DateTimeFormatter fechaNacimiento) {
        super(nombre, DNI, fechaNacimiento);
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        sb.append("====================\n");
        sb.append("Numero Telefono: ").append(numeroTelefono).append("\n");
        sb.append("Dirección: ").append(direccion).append("\n");
        sb.append("email: ").append(email).append("\n");
        sb.append("====================");
        return sb.toString();
    }
}
