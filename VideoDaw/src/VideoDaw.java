import java.time.LocalDate;

public class VideoDaw {
    private String CIF;
    private String DireccionClub;
    private LocalDate FechaAlta;
    private Pelicula[] PeliculasRegistradas;
    private int numPeliculasRegistradas;
    private Cliente[] numClientesRegistrados;

    //CONSTRUCTORES

    VideoDaw(String CIF, String Direccion, LocalDate FechaAlta){
        this.CIF = CIF;
        this.DireccionClub = Direccion;
        this.FechaAlta = FechaAlta;

    }

    //METODOS
    private String mostrarPeliculasRegistradas() {
        return mostrarPeliculasRegistradas();
    }

    public void peliculasRegistradas(Pelicula peliculaARegistrar) {
        for (int i = 0; i < PeliculasRegistradas.length; i++) {
            if (PeliculasRegistradas[i] == null) {
                PeliculasRegistradas[i] = peliculaARegistrar;
                break;
            }
        };
    };

    public String mostrarInfoVideoClub() {
        String mostrarInfoVideoClub = "";
        mostrarInfoVideoClub += "CIF: " + this.CIF + "\n";
        mostrarInfoVideoClub += "Direccion: " + this.DireccionClub + "\n";
        mostrarInfoVideoClub += "Fecha Alta: " + this.FechaAlta + "\n";
        return mostrarInfoVideoClub;
    }




}
