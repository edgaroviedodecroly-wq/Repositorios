import java.time.LocalDate;

public class Cliente {
    private String DNI;
    private String Nombre;
    private String NumSocio;
    private String Direccion;
    private LocalDate FechaNacimiento;
    private LocalDate FechaBaja;

    private Pelicula[] PeliculasAlquiladas;
    private int numPeliculasAlquiladas;

    public Cliente(String DNI, String nombre, String numSocio, String direccion, String fechaNacimiento) {
        this.DNI = DNI;
        this.Nombre = nombre;
        this.NumSocio = numSocio;
        this.Direccion = direccion;
        this.FechaNacimiento = FechaNacimiento;


        this.PeliculasAlquiladas = new Pelicula[10];
        this.numPeliculasAlquiladas = 0;
    }

    String mostrarInfoCliente() {
        String mostrarInfoCliente ="";
         mostrarInfoCliente += "DNI: " + this.DNI + "\n";
         mostrarInfoCliente += "Nombre: " + this.Nombre + "\n";
         mostrarInfoCliente += "Numero de socio: " + this.NumSocio + "\n";
         mostrarInfoCliente += "Direccion: " + this.Direccion+ "\n";
         mostrarInfoCliente += "Fecha de Nacimiento" + this.FechaNacimiento + "\n";
        return mostrarInfoCliente;
    }
}
