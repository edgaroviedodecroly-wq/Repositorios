import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Agenda {
    private HashMap<String, Contacto> contacto;

    public Agenda() {
        contacto = new HashMap<>();
    }

    public void addContacto() {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String telefono = "";
        String correo = "";

        
        while (true){
        System.out.println("Introduce el nombre del contacto: ");
        nombre = sc.nextLine();

        if (!nombre.matches("[a-zA-Z0-9]{1,}")) {
            System.out.println("Introduce un nombre de contacto valido:");
        } else if (contacto.containsKey(nombre)) {
            System.out.println("El contacto ya existe");
        } else {
            break;
        }
        }

        while(true){
            System.out.println("Introduce el telefono del contacto: ");
            telefono = sc.nextLine();

            if (!telefono.matches("^[679][0-9]{8}$")) {
                System.out.println("Introduce un telefono valido:");
            } else if (contacto.containsKey(telefono)) {
                System.out.println("El telefono ya existe");
            } else  {
                break;
            }
        }


        while(true){
            System.out.println("Introduce correo del contacto: ");
            correo = sc.nextLine();
            if (!correo.matches("^[a-z0-9_.-]+@[a-z]+\\.[a-z]{2,4}$")){
                System.out.println("Introduce un correo valido:");
            } else if (contacto.containsKey(correo)) {
                System.out.println("El correo ya existe");
            } else  {
                break;
            }
        }
        
        Contacto c = new Contacto(nombre, telefono, correo);
        contacto.put(nombre, c);

    }

    public void eliminarContacto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del contacto: ");
        String nombre = sc.nextLine();

        if (contacto.containsKey(nombre)) {
            contacto.remove(nombre);
            System.out.println("Contacto eliminado");
        } else {
            System.out.println("Contacto no encontrado");
        }
    }

    public void buscarContacto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del contacto: ");
        String nombre = sc.nextLine();

        boolean existe = false;
        for (Contacto c : contacto.values()) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(c);
                existe = true;
                break;
            }
        }


        if (!existe) {
            System.out.println("Contacto no encontrado");
        }
    }

    public void verContactos() {
        for (Map.Entry<String, Contacto> entrada : contacto.entrySet()) {
            String nombre = entrada.getKey();
            Contacto contacto = entrada.getValue();
            System.out.println(entrada.getKey() + ": " + contacto);

        }
    }
}
