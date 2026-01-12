import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Set<String> personas = new HashSet<String>();

        personas.add("Daniel");
        personas.add("pepe");
        personas.add("Pedro");
        personas.add("Juan");
        personas.add("Daniel");

        for(String persona : personas){
            System.out.println(persona);
        }

        //conjuto de personas
        Set<Persona> people = new HashSet<>();
        people.add(new Persona("20004w", "jhon", "guti"));
        people.add(new Persona("20007w", "jhonny", "guti"));
        people.add(new Persona("20002w", "jerry", "guti"));
        people.add(new Persona("200054w", "juan", "guti"));

        for (Persona persona : people){
            System.out.println(persona);
        }


        // Ejemplos TreeSet
        System.out.println("\n" + "Ejemplo conjuntos TreeSet: " + "\n");

        Set<String> peopleOrdenadas = new TreeSet<>();

        peopleOrdenadas.add("Pedro");
        peopleOrdenadas.add("Daniel");
        peopleOrdenadas.add("Juan");
        peopleOrdenadas.add("Pedro");

        for(String persona : peopleOrdenadas){
            System.out.println(persona);
        }
    }
}