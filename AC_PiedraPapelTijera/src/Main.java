import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*PIEDRA, PAPEL, TIJERA.*/

        Scanner sc = new Scanner(System.in);
        int seleccionUsuario;

        // inicio el do/while y dentro del do pinto la bienvenida y las opciones
        do{
            System.out.println("Bienvenido a Piedra, Papel y tejera. sigue las instrucciones:");
            System.out.println("1. Piedra \n2. Papel \n3. Tijera \n4. Salir");
            seleccionUsuario = sc.nextInt();

            // genero un numero aleatorio entre 0 y 2 y convierto mediante if y else las opciones en numero a string

            int eleccionMaquina = (int)(Math.random()*3) +1;
            String eleccionMaquinaString;
            if(eleccionMaquina == 1){
                eleccionMaquinaString="Piedra";
            }else if(eleccionMaquina == 2){
                eleccionMaquinaString="Papel";
            } else
                eleccionMaquinaString="Tijera";
            System.out.println("La eleccion de la maquina es: " + eleccionMaquinaString);

            // aqui comienzo el juego comparando la eleccion del usuario con la de la maquina en distintos casos

            switch(seleccionUsuario) {
                case 1: // si se elige piedra
                    if(eleccionMaquina == 1){
                        System.out.println("Empate");
                    }else if(eleccionMaquina == 2){
                        System.out.println("Perdiste");
                    } else
                        System.out.println("Ganaste");
                    break;

                case 2: // si se elige papel
                    if(eleccionMaquina == 1){
                        System.out.println("Ganaste");
                    }else if(eleccionMaquina == 2){
                        System.out.println("Empate");
                    } else
                        System.out.println("Perdiste");
                    break;

                case 3: // si se elige tijera
                    if(eleccionMaquina == 1){
                        System.out.println("Perdiste");
                    }else if(eleccionMaquina == 2){
                        System.out.println("Ganaste");
                    } else
                        System.out.println("Empate");
                    break;

                case 4: // si se presiona 4 se sale.
                    System.out.println("Saliendo...");
                    break;

                default: // si la opcion introducida no es valida pinta lo siguiente:
                    System.out.println("Elige una opcion de las dispuestas");
            }

        }while(seleccionUsuario != 4); // El juego sale cuando preciona 4


    }
}
