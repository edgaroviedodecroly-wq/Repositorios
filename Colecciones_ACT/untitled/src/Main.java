import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Taller taller = new Taller();
    Scanner sc = new Scanner(System.in);
    String opcion = "";

    do{

        opcion = menu();

        switch (opcion) {
            case "1":
               taller.addCoche();
                break;
            case "2":
                taller.eliminarCoche();
                break;
            case "3":
                taller.verCoches();
                break;
            case "4":
                taller.verTaller();
                break;
            case "5":
                break;
            default:
                System.out.println("Por favor introduzca una opcion correcta.");
        }

    }while(!opcion.equals("5"));

}

        private static String menu() {
            Scanner sc;
            String opcion;
            System.out.println("\nTaller");
            System.out.println("1. Añadir coche al taller.");
            System.out.println("2. Eliminar coche del taller.");
            System.out.println("3. Ver Lista coches.");
            System.out.println("4. Ver coches del taller.");
            System.out.println("5. Salir del taller.");

            sc = new Scanner(System.in);
            opcion = sc.nextLine();
            return opcion;
        }
