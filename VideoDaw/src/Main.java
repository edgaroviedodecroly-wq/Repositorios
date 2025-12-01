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
        String Direccion = MiUtils.comprobarPatronRepetidamente(DireccionPattern, "Introduce una direccion:");

        VideoDaw videoClub = new VideoDaw(CIF, Direccion, FechaAlta);

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
                    
                    String cod = MiUtils.comprobarPatronRepetidamente(codPattern, "Introduce Cod: identificador único de la Película: ");
                    String titulo = MiUtils.comprobarPatronRepetidamente(tituloPatttern, "Introduce titulo de la pelicula: ");

                    break;
                case "3":
                    break;
                case "4":
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