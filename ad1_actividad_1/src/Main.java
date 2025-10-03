import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Escribe un programa que dé los “buenos días”.
        System.out.println("Buenos días");

        /*
        Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
         */

        double lado = 5;
        double area = lado * lado;
        System.out.println("Lado: " + lado);
        System.out.println("Area: " + area);

        /*
        Escribe un programa que calcule el área de un cuadrado
        cuyo lado se introduce por teclado.
         */

        System.out.println("\nEjercicio 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor del lado del cuadrado");
        double ladocuadrado = sc.nextDouble();

        double areacuadrado  = ladocuadrado * ladocuadrado;
        System.out.println("Lado: " + ladocuadrado);
        System.out.println("Area: " + areacuadrado);

        /*
        Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
        producto y división.
         */

        System.out.println("\nEjercicio 4");

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Introduce el valor del numero1");
        double numerouno = numero1.nextDouble();

        Scanner numero2 = new Scanner(System.in);
        System.out.println("Introduce el valor del numero2");
        double numerodos = numero2.nextDouble();

        System.out.println("La suma es: " + (numerouno + numerodos));
        System.out.println("La resta es: " + (numerouno - numerodos));
        System.out.println("La divisió´n es: " + (numerouno/numerodos));
        System.out.println("El prodcuto es es: " + (numerouno * numerodos));

        /*
        Escribe un programa que toma como dato de entrada un número que corresponde a la
        longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el
        volumen de la esfera que corresponden con dicho radio.
         */

        System.out.println("\nEjercicio 5");
        double radio, areacircunferecia, volumen;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el valor del radio");
        radio = entrada.nextDouble();

        volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3);
        area = Math.PI * radio * radio;
        areacircunferecia = 2 * Math.pow(radio, 2);

        System.out.println("La circunferecia es: " + areacircunferecia);
        System.out.println("La area del circunferecia es: " + area);
        System.out.println("el volumen es: " + volumen);

        /*
        Escribe un programa que dado el precio de un artículo y el precio de venta real nos
        muestre el porcentaje de descuento realizado
         */
        System.out.println("\nEjercicio 6");
        System.out.println("Ingresa el valor del precio");
        double precio = sc.nextDouble();
        System.out.println("Ingrese el precio de venta");
        double precioventa = sc.nextDouble();

        double porcentaje = ((precio - precioventa) / precio) * 100;
        System.out.println("La porcentaje es: " + porcentaje + "%");

        /*Escribe un programa que lea un valor correspondiente a una distancia en millas marinas
        y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
         */

        System.out.println("\nEjercicio 7");
        System.out.println("Ingresa el valor de distancia en millas: ");
        double millas = sc.nextDouble();
        double metros = millas * 1852;

        System.out.println("La distancia en metros es: " + metros);

        /*Escribe un programa que lee dos números y los visualiza en orden ascendente.*/

        System.out.println("\nEjercicio 8");
        System.out.println("Ingresa primer numero");
        int n1 = entrada.nextInt();

        System.out.println("Ingresa segundo numero");
        int n2 = entrada.nextInt();

        int minimo = Math.min(n1, n2);
        int maximo = Math.max(n1, n2);

        System.out.println("Orden ascendente: " + minimo + ", " + maximo);


        /*
        Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales
         */

        System.out.println("\nEjercicio 9");
        System.out.println("Ingresa primer numero");
        int numeroprimero = entrada.nextInt();
        System.out.println("Ingresa segundo numero");
        int numerosegundo = entrada.nextInt();

        int max = Math.max(numeroprimero, numerosegundo);
        int min = Math.min(numeroprimero, numerosegundo);


        System.out.println("el mayor es " + max);
        System.out.println("¿los numeros son iguales? " + (max == min));

        /*
         Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.
         */

        System.out.println("\nEjercicio 10");
        System.out.println("Ingrese primer numero");
        double num1 = entrada.nextInt();
        System.out.println("Ingrese segundo segundo");
        double num2 = entrada.nextInt();
        System.out.println("Ingrese segundo tercero");
        double num3 = entrada.nextInt();

        double maxi = Math.max(Math.max(num1, num2), num3);
        System.out.println("el valor maximo es " + maxi);

        /*
         Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta,
        producto y división. (Ten en cuenta la división por cero).
         */


        /*
         Escribe un programa que lee 2 números y muestra el mayor
         */

        System.out.println("\nEjercicio 12");
        sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        double num1uno = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2dos = sc.nextDouble();



        /*
         Escribe un programa que lee un número y me dice si es positivo o negativo
         consideraremos el cero como positivo
         */

        System.out.println("\nEjercicio 13");
        System.out.println("Introduce el valore del primer numero");
        double nu1 = sc.nextDouble();

        System.out.println("¿El numero es positivo?: " + (nu1 >= 0));
















    }
}