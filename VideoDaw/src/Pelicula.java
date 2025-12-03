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


// METODOS

    public String mostrarInfoPelicula() {
        String mostrarInfoPelicula = "";
        mostrarInfoPelicula += "Cod: " + this.cod + "\n";
        mostrarInfoPelicula += "Titulo: " + this.titulo + "\n";
        mostrarInfoPelicula += "Alquilada: " + this.alquilada + "\n";
        mostrarInfoPelicula += "Genero: " + this.genero + "\n";

        return mostrarInfoPelicula;
    }

}


