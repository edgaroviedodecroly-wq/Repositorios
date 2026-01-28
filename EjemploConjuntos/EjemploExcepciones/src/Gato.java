import java.util.Scanner;

public class Gato {
    private String nombre;
    private int edad;

    public Gato() throws Exception {
        this.nombre = nombre;
        this.edad = edad;
    }

    private boolean nombreValido(String nombre) {
        return nombre != null && !nombre.matches("[a-zA-Z0-9]{3,}");
    }
    public String getNombre() throws Exception{
        if (!nombreValido(this.nombre)) {
            throw new Exception("Nombre invalido");
        }
        this.nombre = nombre;
        return "";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception{
        if (edad < 0) {
            throw new Exception("Edad invalido");
        }
        this.edad = edad;
    }

//    public void ponerNombre() {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el nomrbre del gato: ");
//        nombre = sc.nextLine();
//
//            if (!nombre.matches("[a-zA-Z0-9]{3,}")){
//                throw new IllegalArgumentException("El nombre del gato no es valido");
//            }
//    }



    public void ponerEdad()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el edad del gato: ");
        edad = sc.nextInt();

//        if (edad < 0 ) throw new {
//
//        }


    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("====================\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("====================");
        return sb.toString();
    }
}
