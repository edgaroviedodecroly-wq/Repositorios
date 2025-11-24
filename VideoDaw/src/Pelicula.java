import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula {
    private String cod;
    private String titulo;
    private enum genero{}
    private LocalDate fechaRegistro;
    private LocalDateTime fechaAlquiler;
    private boolean alquilada;


    //Constructores
    public Pelicula (String cod, String titulo, boolean alquilada) {
        this.cod = cod;
        this.titulo = titulo;
        this.alquilada = alquilada;
    }

    // METODOS

    public String mostrarInfoPelicula() {
        String mostrarInfoPelicula = "";
        mostrarInfoPelicula += "Cod: " + this.cod + "\n";
        mostrarInfoPelicula += "Titulo: " + this.titulo + "\n";
        mostrarInfoPelicula += "Alquilada: " + this.alquilada + "\n";

        return mostrarInfoPelicula;
    }

}


