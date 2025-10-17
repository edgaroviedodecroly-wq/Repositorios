import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {

////    Ejercicio 14
//
//        System.out.print("Ingrese numero de horas trabajadas: ");
//        Scanner sc = new Scanner(System.in);
//        double horasTrabajadas = sc.nextDouble();
//        System.out.print("Ingrese Precio por hora: ");
//        double precioPorHora = sc.nextDouble();
//        double bruto;
//        double neto;
//        double impuestos;
//
//        if (horasTrabajadas <= 35) {
//            bruto = horasTrabajadas * precioPorHora;
//        } else {
//            bruto = (35 * precioPorHora) + ((horasTrabajadas - 35) * precioPorHora * 1.5);
//        }
//
//
//        if (bruto <= 500) {
//            impuestos = 0;
//        } else if (bruto <= 900) {
//            impuestos = (bruto - 500) * 0.25;
//        } else {
//            impuestos = (400 * 0.25) + ((bruto - 900) * 0.45);
//        }
//
//        neto = bruto - impuestos;
//
//
//        System.out.println("Su salario bruto: " + bruto);
//        System.out.println("Su salario impuestos: " + impuestos);
//        System.out.println("Su salario neto: " + neto);


//          Actidad 3

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese cantidad en euros multiplo de 5: ");
            int valor = sc.nextInt();

            if (valor % 5 != 0){
                System.out.println("El valor debe ser multiplo de 5");
            } else {

                int[] billetes = {5, 10, 20, 50, 100, 200, 500};

                for (int i = billetes.length -1; i >= 0; i--) {
                    int billete = billetes[i];
                    int numBilletes = valor / billete;
                    valor = valor % billete;
                    if (numBilletes > 0) {
                        System.out.println(numBilletes + " Billetes de " + billete + " Euros");
                    }
                }
            }







//
////    1. Crea un programa que pida diez números reales por teclado, los almacene en un array,
////    y luego muestre todos sus valores
//        Scanner sc2 = new Scanner(System.in);
//
//        double[] numeros = new double[10];
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Ingrese el numero" + (i + 1) + ": ");
//            numeros[i] = sc2.nextDouble();
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("numero " + (i + 1) + ": " + numeros[i]);
//        }
//
//
////        Crea un programa que pida diez números reales por teclado, los almacene en un array,
////        y luego muestre la suma de todos los valores.
//
//        Scanner sc3 = new Scanner(System.in);
//        double[] numeros2 = new double[10];
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("ingresa un numero" + (i + 1) + ":");
//            numeros2[i] = sc2.nextDouble();
//        }
//
//        double suma = 0;
//        for (int i = 0; i < 10; i++) {
//            suma += numeros2[i];
//        }
//        System.out.println("La suma de los numeros es: " + suma);
//
//
////        Crea un programa que pida diez números reales por teclado, los almacene en un array,
////        y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.

//        Scanner sc4 = new Scanner(System.in);
//        double[] numeros3 = new double[10];
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("ingrese un numero"+ (i+1) + ":");
//            numeros3[i] = sc4.nextDouble();
//        }
//
//        double maximo = numeros3[0];
//        double minimo = numeros3[0];
//
//        for (int i = 0; i < 10; i++) {
//            if (numeros3[i] > maximo) {
//                maximo = numeros3[i];
//            }
//            if (numeros3[i] < minimo) {
//                minimo = numeros3[i];
//            }
//        }

//
//        System.out.println("El numero mayor es: " + maximo);
//        System.out.println("El numero menor es: " + minimo);

//        Crea un programa que pida veinte números enteros por teclado, los almacene en un
//        array y luego muestre por separado la suma de todos los valores positivos y negativos.

//        Scanner sc5 = new Scanner(System.in);
//
//        double [] numeros4 = new double[20];
//        int sumaPositivos = 0;
//        int sumaNegativos = 0;
//
//        for (int i = 0; i < 20; i++) {
//            System.out.print("ingrese un numero"+ (i+1) + ":");
//            numeros4[i] = sc5.nextDouble();
//        }
//
//        for (int i = 0; i < 20; i++) {
//            if (numeros4[i] > 0) {
//                sumaPositivos += numeros4[i];
//            } else if (numeros4[i] < 0) {
//                sumaNegativos += numeros4[i];
//            }
//
//        }
//
//        System.out.println("La suma de positivos es: " + sumaPositivos);
//        System.out.println("La suma de negativos es: " + sumaNegativos);

//        Crea un programa que pida veinte números reales por teclado, los almacene en un array
//        y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.

//        Scanner sc = new Scanner(System.in);
//        double[] numeros5 = new double[20];
//        double suma = 0;
//
//        for  (int i = 0; i < numeros5.length; i++) {
//            System.out.println("numeros "  + (i + 1) + ":");
//            numeros5[i] = sc.nextDouble();
//            suma += numeros5[i];
//        }
//
//        double media = suma / numeros5.length;
//        System.out.println("media: " + media);

//        Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
//        N, escriba M en todas sus posiciones y lo muestre por pantalla.

//        Scanner sc2 = new Scanner(System.in);
//
//
//        System.out.println("introduce un valor entero: ");
//        int N = sc2.nextInt();
//        System.out.println("introduce un segundo valor entero: ");
//        int M = sc2.nextInt();
//
//        int[] sizeN = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            sizeN[i] = M;
//        }
//        System.out.println("\nContenido del array");
//        for (int i = 0; i < N; i++) {
//            System.out.print(sizeN[i] + " ");
//        }

//        Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
//        todos los valores desde P hasta Q, y lo muestre por pantalla

//            Scanner sc5 = new Scanner(System.in);
//
//        System.out.println("ingresa primer valor entero: ");
//        int primero = sc.nextInt();
//        System.out.println("ingresa segundo valor entero: ");
//        int segundo = sc.nextInt();
//
//        int[] array = new int[] {segundo, primero};
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("valor "  + i + ": " + array[i] + "\n");
//        }
//        for (int item: array) {
//            System.out.print("valor: "  + item + "\n");
//        }


//        System.out.println("valor uno: " + array[0] + ", valor dos: " + array[1] );
//
//        String mensaje = String.format("Esto es un mensaje que saca lo que declare %s y %s", primero, segundo);
//        System.out.println(mensaje);


    }
}