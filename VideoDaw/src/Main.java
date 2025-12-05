import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc;

        System.out.println("Bienvenido a LibreCoders registra tu VideoClub");
        String CIFpanttern = "[A-B]{1}[0-9]{9}";
        final String DireccionPattern = "[a-zA-Z0-9 ,.]+";
        final LocalDate FechaAlta = LocalDate.now();
        final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String CIF = MiUtils.comprobarPatronRepetidamente(CIFpanttern, "Introduce un CIF: ");
        String DireccionClub = MiUtils.comprobarPatronRepetidamente(DireccionPattern, "Introduce una direccion:");

        VideoDaw videoClub = new VideoDaw(CIF, DireccionClub, FechaAlta);

        String opcion = "";

        do{

            System.out.println("\nLibreCoders");
            System.out.println("1. Datos del video club.");
            System.out.println("2. Registrar película en videoclub.");
            System.out.println("3. Crear y registrar cliente en videclub.");
            System.out.println("4. Alquilar película.");
            System.out.println("5. Devolver película");
            System.out.println("6. Dar de baja cliente.");
            System.out.println("7. Dar de baja película.");
            System.out.println("8. Salir");

            sc = new Scanner(System.in);
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println(videoClub.mostrarInfoVideoClub());
                    break;
                case "2" :
                    Scanner sc2 = new Scanner(System.in);
                    final String codPattern = "P-[0-9]{4}";
                    final String tituloPatttern = "[a-zA-Z0-9 ]{1,50}";
                    final String generoPattern = "[1-"+Genero.values().length+"]{1}";


                    String cod = MiUtils.comprobarPatronRepetidamente(codPattern, "Introduce Cod: identificador único de la Película: ");
                    String titulo = MiUtils.comprobarPatronRepetidamente(tituloPatttern, "Introduce titulo de la pelicula: ");

                    Genero.getMostrarGeneros();
                    String generoPrueba = MiUtils.comprobarPatronRepetidamente(generoPattern, "Introduce el genero de la pelicual");
                    Genero generoElegido = Genero.values()[Integer.valueOf(generoPrueba)-1];

                    Pelicula pelicula = new Pelicula(cod, titulo, generoElegido);
                    videoClub.peliculasRegistradas(pelicula);
                    System.out.println(pelicula.mostrarInfoPelicula());

                    break;
                case "3":
                    Scanner sc3 = new Scanner(System.in);
                    final String dniPattern = "[0-9]{8}[A-Za-z]";
                    final String nombrePattern = "[A-Za-zÁÉÍÓÚáéíóúÑñ ]+";
                    final String numeroSocioPattern = "[0-9]{6}";
                    final String direccionPattern = "[a-zA-Z0-9 ,.]+";
                    final String fechaNacimientoPattern = "\\d{4}[/-]\\d{2}[/-]\\d{2}";

                    String DNI = MiUtils.comprobarPatronRepetidamente(dniPattern, "Introduce numero de DNI: ");
                    String Nombre = MiUtils.comprobarPatronRepetidamente(nombrePattern, "Introduce un Nombre: ");
                    String NumSocio = MiUtils.comprobarPatronRepetidamente(numeroSocioPattern, "Introduce un numero de socio: ");
                    String Direccion = MiUtils.comprobarPatronRepetidamente(direccionPattern, "Introduce la direccion del cliente: ");
                    String fechaNacimiento = MiUtils.comprobarPatronRepetidamente(fechaNacimientoPattern, "Introduce fecha de nacimiento yyyy/MM/dd: ");

                    Cliente socio = new Cliente(DNI, Nombre, NumSocio, Direccion, fechaNacimiento);
                    break;
                case "4":
                    Scanner sc4 = new Scanner(System.in);

                    final String cod2Pattern = "P-[0-9]{4}";
                    final String dni2Pattern = "[0-9]{8}[A-Za-z]";
                    cod = MiUtils.comprobarPatronRepetidamente(cod2Pattern, "Introduce el codigo de la pelicula a alquilar: ");
                    DNI = MiUtils.comprobarPatronRepetidamente(dni2Pattern, "Introduce numero de DNI: ");
                    if (cod != null && DNI != null) {

                    }
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                default:
                    System.out.println("Por favor introduzca una opcion correcta.");
            }

        }while(!opcion.equals("8"));








    }
}