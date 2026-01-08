import java.time.LocalDate;
import java.time.LocalDateTime;

public class VideoDaw {
    private String CIF;
    private String DireccionClub;
    private LocalDate FechaAlta;
    private Pelicula[] PeliculasRegistradas;
    private Cliente[] numClientesRegistrados;

    private int contadorPeliculas = 0;
    private int contadorClientes = 0;

    //CONSTRUCTORES

    VideoDaw(String CIF, String Direccion){
        this.CIF = CIF;
        this.DireccionClub = Direccion;
        this.FechaAlta = LocalDate.now();

    }

    //METODOS
    public static String mostrarPeliculasRegistradas() {

        return mostrarPeliculasRegistradas();
    }

    public void peliculasRegistradas(Pelicula peliculaARegistrar) {
        PeliculasRegistradas = new Pelicula[100];
        for (int i = 0; i < PeliculasRegistradas.length; i++) {
            if (PeliculasRegistradas[i] == null) {
                PeliculasRegistradas[i] = peliculaARegistrar;
                break;
            }
        };
    };

    public boolean alquilarPelicula(Pelicula cod, Pelicula DNI) {
        if (cod == null && DNI == null) return false;
        if (cod.isAlquilada()) {
            System.out.println("ERROR: La pelicula ya esta alquilada.");
            return false;
        }

        cod.setAlquilada(true);
        cod.setFechaAlquiler(LocalDateTime.now());
        DNI.InsertarPelicula(cod);
        return false;
    }

    public String mostrarInfoVideoClub() {
        String mostrarInfoVideoClub = "";
        mostrarInfoVideoClub += "CIF: " + this.CIF + "\n";
        mostrarInfoVideoClub += "Direccion: " + this.DireccionClub + "\n";
        mostrarInfoVideoClub += "Fecha Alta: " + this.FechaAlta + "\n";
        return mostrarInfoVideoClub;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VideoDaw{");
        sb.append("CIF='").append(CIF).append('\'');
        sb.append(", DireccionClub='").append(DireccionClub).append('\'');
        sb.append(", FechaAlta=").append(FechaAlta);
        sb.append('}');
        return sb.toString();
    }


    public String mostrarClientesRegistrados() {
        String info = mostrarClientesRegistrados();
        for (int i = 0; i < this.contadorClientes; i++) {
            info += this.numClientesRegistrados[i].toString() + "\n";
        }
        return info;
    }
}
