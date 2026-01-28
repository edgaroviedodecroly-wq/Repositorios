import java.util.InputMismatchException;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

//        // Ejercicio 1
//
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Ingrese un numero: ");
//            int numero = sc.nextInt();
//            System.out.println("valor introducido: " + numero);
//
//        } catch (InputMismatchException e) {
//            System.out.println("Valor introducido incorrecto Error: " + e.getMessage());
//        }
//        finally {}
//
//        // Ejercicio 2
//
//        try {
//            Scanner lector = new Scanner(System.in);
//            System.out.println("Ingrese un numeroA: ");
//            String numeroA = lector.nextLine();
//            int dividendo = Integer.parseInt(numeroA);
//
//            System.out.println("Ingrese un numeroB: ");
//            String numeroB = lector.nextLine();
//            int divisor = Integer.parseInt(numeroB);
//            int resultado = dividendo / divisor;
//
//            System.out.println("Resultado: " + resultado);
//
//        } catch (InputMismatchException e) {
//            System.out.println("Valor introducido incorrecto Error: " + e.getMessage());
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Error no se puede divir entre cero: " + e.getMessage());
//        }
//        catch (Exception e) {
//            System.out.println("Error fallo en programa");
//        }
//
//        // Ejercicio 3
//
//        Scanner lector = new Scanner(System.in);
//        double[] vector = new double[5];
//
//        for (int i = 0; i < vector.length; i++) {
//            System.out.println("Ingrese vector: ");
//            vector[i] = lector.nextDouble();
//
//        try {
//            lector.nextLine();
//        }
//        catch (InputMismatchException e) {
//            System.out.println("Valor introducido incorrecto Error: " + e.getMessage());
//            break;
//        }
//        catch (Exception e) {
//            System.out.println("Error fallo en programa");
//        }
//    }

        // Ejercicio 4
//        ImprimirNegativo negativo = new ImprimirNegativo();
//        ImprimirPositivo positivo = new ImprimirPositivo();
//
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("Ingrese un numero negativo: ");
//            int numero = sc.nextInt();
//
//            try {
//                negativo.imprimirNegativo(numero);
//            } catch (Exception e) {
//                System.out.println("Error fallo en programa");
//            } break;
//
//        }
//
//        while (true) {
//            System.out.println("Ingrese un numero positivo: ");
//            int numero = sc.nextInt();
//
//            try {
//                positivo.imprimirPositivo(numero);
//            } catch (Exception e) {
//                System.out.println("Error fallo en programa");
//            }  break;
//
//        }


        // Ejercicio 5
        Gato nuevorGato = new Gato();
        try {
            nuevorGato.ponerNombre();
        } catch (Exception e){
            System.out.println("Error fallo en programa");
        }


        try {
            nuevorGato.ponerEdad();
        } catch (Exception e){
            System.out.println("Error fallo en programa");
        }

        nuevorGato.toString();






    }
}