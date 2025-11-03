//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
        y luego muestre la matriz por pantalla. */

        int num = 1;
        int [][] matriz1 = new int[5][5];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = num;
                num++;
                System.out.println(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        /* Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
        multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla. */

        int [][] matriz2 = new int[10][10];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (i +1) + (j + 1);
                System.out.println(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        /*Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
        introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
        matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
        menores que cero y cuántos son igual a cero. */

        



    } // MAIN
} // CLASS