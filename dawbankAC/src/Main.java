import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Iban: ");
        String iban = sc.nextLine();
        System.out.print("Ingrese Titular: ");
        String titular = sc.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(iban, titular);

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
                    System.out.print("Ingrese fecha de ingreso: ");
                    String fecha = sc.nextLine();

                    if (cuenta.ingreso(cantidad, fecha)) {
                        System.out.println("Ingreso realizado correctamente");
                    } else {
                        System.out.println("Ingreso realizado incorrectamente");
                    }
                    break;
                case 6:
                    System.out.println("Introduce cantidad a retirar: ");
                    double cantidadRetirada = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Ingrese fecha del retiro: ");
                    String fechaRetirada = sc.nextLine();

                    if (cuenta.retirada(cantidadRetirada, fechaRetirada)) {
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