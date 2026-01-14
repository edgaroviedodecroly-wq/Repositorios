import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    Agenda agenda = new Agenda();
    String opcion = "";
    do{

        opcion = menu();

        switch (opcion) {
            case "1":
                agenda.addContacto();
                break;
            case "2":
                agenda.eliminarContacto();
                break;
            case "3":
                agenda.buscarContacto();
                break;
            case "4":
                agenda.verContactos();
                break;
            case "5":
                System.out.println("Saliendo de la agenda...");
                break;
            default:
                System.out.println("Por favor introduzca una opcion correcta.");
        }

    }while(!opcion.equals("5"));

}

private static String menu() {
    String opcion;
    Scanner sc;
    System.out.println("\nAgenda");
    System.out.println("1. Añadir contacto a la agenda.");
    System.out.println("2. Eliminar contacto de agenda.");
    System.out.println("3. buscar contacto en la agenda.");
    System.out.println("4. Ver contactos de la agenda.");
    System.out.println("5. Salir de la agenda.");

    sc = new Scanner(System.in);
    opcion = sc.nextLine();
    return opcion;
}
