import java.time.format.DateTimeFormatter;

public class Persona {
    private String nombre;
    private String DNI;
    private DateTimeFormatter FechaNacimiento = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Persona(String nombre, String DNI, DateTimeFormatter fechaNacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        FechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public DateTimeFormatter getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(DateTimeFormatter fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("====================\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("DNI: ").append(DNI).append("\n");
        sb.append("FechaNacimiento: ").append(FechaNacimiento).append("\n");
        sb.append("====================");
        return sb.toString();
    }
}
