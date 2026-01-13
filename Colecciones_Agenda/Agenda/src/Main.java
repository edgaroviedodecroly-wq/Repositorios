//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    Agenda agenda = new Agenda();
    String opcion = "";
    do{

        System.out.println("\nTaller");
        System.out.println("1. Añadir contacto a la agenda.");
        System.out.println("2. Eliminar contacto de agenda.");
        System.out.println("3. buscar contacto en la agenda.");
        System.out.println("4. Ver coches del taller.");
        System.out.println("5. Salir del taller.");

        sc = new Scanner(System.in);
        opcion = sc.nextLine();

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
                break;
            case "5":
                break;
            default:
                System.out.println("Por favor introduzca una opcion correcta.");
        }

    }while(!opcion.equals("5"));

}
