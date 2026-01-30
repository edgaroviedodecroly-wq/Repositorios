import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicio mi programa y dos variables String
        Scanner sc = new Scanner(System.in);
        System.out.print("Bienvenido a DawBank" + "\n");
        String iban = "";
        String cliente = "";

        // Pido los datos y los paso por dos filtros, para evitar mala praxis.

        while(true) {
            try {
                System.out.println("Introduzca Iban: ");
                iban = sc.nextLine().toUpperCase();

                CuentaBancaria.validarIban(iban);
                break;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while(true) {
            try {
                System.out.println("Introduce nombre del titular: ");
                cliente = sc.nextLine().toUpperCase();

                CuentaBancaria.validarNombre(cliente);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Creo cuenta para cuando alguien se registre con iban y titular

        CuentaBancaria cuenta = new CuentaBancaria(iban, cliente);

        // Creo el do-while con los  prints, seguido de los case.

        String opcion = "";

        do{
            System.out.println(imprimiMenuOpciones());
            opcion = sc.nextLine();

            switch(opcion){
                case "1":
                    System.out.print(cuenta.mostrarDatos());
                    break;
                case "2":
                    System.out.print(cuenta.getIban());
                    break;
                case "3":
                    System.out.print(cuenta.getCliente());
                    break;
                case "4":
                    System.out.print(cuenta.getSaldo());
                    break;
                case "5":
                    Ingresar(sc, cuenta);
                    break;
                case "6":
                    Retirar(sc, cuenta);
                    break;
                case "7":
                    Movimiento(cuenta);
                    break;
                case "8":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while(!opcion.equals("8"));
        sc.close();

    }

    private static void Movimiento(CuentaBancaria cuenta) {
        HashMap<String, ArrayList<Movimiento>> listaMovimiento = cuenta.getMovimientos();
        int n = cuenta.NumMovimientos();

        if (n == 0) {
            System.out.println("No hay movimientos registrados.");
        } else {

            for (String key : listaMovimiento.keySet()) {
                System.out.println(listaMovimiento.toString());
            }
//            for (int i = 0; i < n; i++) {
//                System.out.println(listaMovimiento[i].toString());
//            }
        }
    }

    private static void Ingresar(Scanner sc, CuentaBancaria cuenta) {
        System.out.println("Introduce la cantidad a ingresar: ");
        double cantidad = sc.nextDouble();
        sc.nextLine();

//        if (cuenta.ingreso(cantidad)) {
//            System.out.println("Ingreso realizado correctamente");
//        } else {
//            System.out.println("Ingreso realizado incorrectamente");
//        }
        try {
            cuenta.ingreso(5000);
        } catch (AvisarHaciendaException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void Retirar(Scanner sc, CuentaBancaria cuenta) {
        System.out.println("Introduce cantidad a retirar: ");
        double cantidadRetirada = sc.nextDouble();
        sc.nextLine();

//        if (cuenta.retirada(cantidadRetirada)) {
//            System.out.println("Retiro realizado correctamente");
//        } else {
//            System.out.println("El retiro no se realizo correctamente");
//        }

        try {
            cuenta.retirada(5000);
        } catch (AvisarHaciendaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String imprimiMenuOpciones() {
        System.out.println("\nDawBank");
        System.out.println("1. Datos de la cuenta");
        System.out.println("2. IBAN");
        System.out.println("3. Titular");
        System.out.println("4. Saldo");
        System.out.println("5. Ingreso");
        System.out.println("6. Retirar");
        System.out.println("7. Movimientos");
        System.out.println("8. Salir");
        return "";
    }
}