import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nEjercicio 1");
        System.out.println("ingresa tu edad");
        int edad = (new Scanner(System.in)).nextInt();
        if (edad >= 18) {
            System.out.println("usted mayor de edad");
        }

        System.out.println("\nEjercicio 2");
        System.out.println("ingresa tu edad");
        int edad2 = (new Scanner(System.in)).nextInt();
        if (edad2 < 18) {
            System.out.println("usted es menor de edad");
        } else if (edad2 > 18) {
            System.out.println("usted es mayor edad");
        }

        System.out.println("\nEjercicio 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el numero maximo 20: ");
        int max = sc.nextInt();

        for(int i = 1; i <= max; ++i) {
            System.out.println("numero: " + i);
        }

        System.out.println("\nEjercicio 4");
        new Scanner(System.in);
        int maximo = 200;

        for(int i = 2; i <= maximo; i += 2) {
            System.out.println("el numero par : " +  i);
        }

        System.out.println("\nEjercicio 5");
        new Scanner(System.in);

        for(int i = 1; i <= 200; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nEjercicio 6");
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc4.nextInt();

        for(int i = 1; i <= num; ++i) {
            System.out.println(i);
        }

        System.out.println("\nEjercicio 7");
        Scanner sc5 = new Scanner(System.in);
        System.out.print("Ingrese una nota del 0 al 10: ");
        int nota = sc5.nextInt();
        if (nota >= 0 && nota <= 3) {
            System.out.println("Muy deficiente");
        } else if (nota >= 3 && nota <= 5) {
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Bien");
        } else if (nota >= 6 && nota <= 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        }

        System.out.println("\nEjercicio 8");
        Scanner sc6 = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int num2 = sc6.nextInt();
        if (num2 < 0) {
            System.out.println("introduce un numero positivo");
        } else {
            int factorial = 1;

            for(int i = 1; i <= num2; ++i) {
                factorial = factorial * i;
            }

            System.out.println("el factorial de " + num2 + " es " + factorial);
        }

        System.out.println("\nEjercicio 9");
        Scanner sc7 = new Scanner(System.in);
        System.out.println("ingresa una hora: ");
        int hora = sc7.nextInt();
        System.out.println("ingrese minutos: ");
        int min = sc7.nextInt();
        System.out.println("ingrese segundos: ");
        int seg = sc7.nextInt();


        seg++;
        seg++;


        if (seg == 60) {
            seg = 0;
            seg++;
        }

        if (min == 60) {
            min = 0;
            min++;
        }

        if (hora == 24) {
            hora = 0;
        }
        System.out.println("la hora sumandole un segundo es: " + hora + ":" + min + ":" + seg);


        /* Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha
        leído algún número negativo o no. */

        System.out.println("\nEjercicio 10");
        Scanner sc8 = new Scanner(System.in);
        System.out.println("Ingresa numero 10: ");
        num = sc8.nextInt();

        for(int i = 0; i <= num; ++i)
        {
            if (i >= num) {
                System.out.println("negativo");
            } else if (i >= 0) {
                System.out.println("positivo");
            }


        }













    }
}
