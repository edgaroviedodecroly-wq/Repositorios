import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula {
    private String cod;
    private String titulo;
    private Genero genero;
    private LocalDate fechaRegistro = LocalDate.now();
    private LocalDateTime fechaAlquiler;
    private boolean alquilada = false;



    //Constructores
    public Pelicula (String cod, String titulo, Genero genero) {
        this.cod = cod;
        this.titulo = titulo;
        this.genero = genero;
    }

    public boolean isAlquilada() {
        return alquilada;
    }

    public void setAlquilada(boolean alquilada) {
        this.alquilada = alquilada;
    }

    public LocalDateTime getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDateTime FechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

// METODOS

    public String mostrarInfoPelicula() {
        String mostrarInfoPelicula = "";
        mostrarInfoPelicula += "Cod: " + this.cod + "\n";
        mostrarInfoPelicula += "Titulo: " + this.titulo + "\n";
        mostrarInfoPelicula += "Alquilada: " + this.alquilada + "\n";
        mostrarInfoPelicula += "Genero: " + this.genero + "\n";

        return mostrarInfoPelicula;
    }

    public boolean InsertarPelicula(Pelicula cod) {
        if (cod == null)return false;
        return false;
    }
}


