import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicio mi programa y dos variables String
        Scanner sc = new Scanner(System.in);
        System.out.print("Bienvenido a DawBank" + "\n");
        String iban = "";
        String titular = "";

        // Pido los datos y los paso por dos filtros, para evitar mala praxis.

        while(true) {
            System.out.println("Introduzca Iban: ");
            iban = sc.nextLine().toUpperCase();

            if (iban.matches("^[A-Z]{2}[0-9]{22}$")) {
                break;
        }else {
                System.out.println("ERROR: Introduce un IBAN correcto.");
            }
        }

        while(titular.isEmpty()) {
            System.out.println("Introduce nombre del titular: ");
            titular = sc.nextLine().toUpperCase();
            if (titular.isEmpty()) {
                System.out.println("ERROR: El campo de titular tiene que estar completado.");
            }
        }

        // Creo cuenta para cuando alguien se registre con iban y titular

        CuentaBancaria cuenta = new CuentaBancaria(iban, titular);

        // Creo el do-while con los  prints, seguido de los case.

        int opcion;

        do{
            System.out.println("\nDawBank");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirar");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");

            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:
                    System.out.print(cuenta.mostrarDatos());
                    break;
                case 2:
                    System.out.print(cuenta.getIban());
                    break;
                case 3:
                    System.out.print(cuenta.getTitular());
                    break;
                case 4:
                    System.out.print(cuenta.getSaldo());
                    break;
                case 5:
                    System.out.println("Introduce la cantidad a ingresar: ");
                    double cantidad = sc.nextDouble();
                    sc.nextLine();

                    if (cuenta.ingreso(cantidad)) {
                        System.out.println("Ingreso realizado correctamente");
                    } else {
                        System.out.println("Ingreso realizado incorrectamente");
                    }
                    break;
                case 6:
                    System.out.println("Introduce cantidad a retirar: ");
                    double cantidadRetirada = sc.nextDouble();
                    sc.nextLine();

                    if (cuenta.retirada(cantidadRetirada)) {
                        System.out.println("Retiro realizado correctamente");
                    } else {
                        System.out.println("El retiro no se realizo correctamente");
                    }
                    break;
                case 7:
                    Movimiento[] listaMovimiento = cuenta.getMovimientos();
                    int n = cuenta.NumMovimientos();

                    if (n == 0) {
                        System.out.println("No hay movimientos registrados.");
                    } else {
                        for (int i = 0; i < n; i++) {
                            System.out.println(listaMovimiento[i].mostrarInfoMovimiento());
                        }
                    }
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while(opcion!= 8);
        sc.close();


    }
}