import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Taller {
    private HashMap<String, Coche> coches;

        public Taller() {
            coches = new HashMap<>();
        }

        public void addCoche() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la matricula del coche");
            String matricula = sc.nextLine();

            if (matricula.equals("")) {
                System.out.println("Introduce la matricula del coche");
            } else if  (coches.containsKey(matricula)) {
                System.out.println("Esta matricula ya existe");
            }

            System.out.println("Introduce la marca del coche");
            String marca = sc.nextLine();

            System.out.println("Introduce el color del coche");
            String color = sc.nextLine();

            Coche coche = new Coche(marca, color);

            coches.put(matricula, coche);
        }

        public void eliminarCoche() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la matricula del coche a eliminar");
            String matricula = sc.nextLine();
            if (coches.containsKey(matricula)) {
                coches.remove(matricula);
                System.out.println("Coche eliminado");
            } else {
                System.out.println("No exixste un coche con esta matricula");
            }
        }

        public void verMatricula() {
            for  (String matricula : coches.keySet()) {
                System.out.println(matricula);
            }
        }

        public void verCoches() {
            for  (Coche coche : coches.values()) {
                System.out.println(coche);
            }
        }

        public void verTaller() {
            for (Map.Entry<String, Coche> entrada : coches.entrySet()) {
                String matricula = entrada.getKey();
                Coche coche = entrada.getValue();
                System.out.println(entrada.getKey() + " = " + coche);

            }
        }

        // Otra opcion a parte del entry.

//    public void verTallerCoches() {
//            for(String matricula : coches.keySet()) {
//                System.out.println(matricula + " → " + coches.get(matricula));
//            }
//    }


    public void verNumeroElementos () {
            System.out.println("Hay " + coches.size() + " coches");
    }




}

