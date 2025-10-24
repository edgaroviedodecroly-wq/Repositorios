import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Crea un programa que pida una cadena de texto por teclado y luego muestre cada
        palabra de la cadena en una línea distinta. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena palabras");
        String texto = sc.nextLine();
        String[] palabras = texto.split(" ");

        for (int i = 0 ; i < palabras.length; i++){
            System.out.println(palabras[i]);
        }

        /* Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
        iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas. */

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce una cadena palabras");
        String texto1 = sc.nextLine();
        System.out.println("Introduce una cadena palabras");
        String texto2 = sc.nextLine();

        if (texto1.equalsIgnoreCase(texto2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }

        /* Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
        Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
        las tres primeras letras de cada uno de ellos. Por ejemplo, si se introduce “Lionel”,
        “Tarazón” y “Alcocer” mostrará “LIOTARALC” */

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Introduce tu segundo apellido: ");
        String apellido2 = sc.nextLine();

        System.out.println((nombre.substring(0, 3) + apellido.substring(0, 3) + apellido2.substring(0, 3)).toUpperCase());

        /* Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas
        ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
        mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me mima” dirá que hay:

        Nº de A's: 3
        Nº de E's: 1
        Nº de I's: 2
        Nº de O's: 0
        Nº de U's: 0*/

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Introduce tu una frase: ");
        String frase = sc.nextLine().toLowerCase();

        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            switch (c){
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
            }
        }

        
    }//CLASE
}//MAIN