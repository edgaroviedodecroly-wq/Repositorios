import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {

//
////          1. Crea 5 instancias de la Clase Producto.
////          2. Crea un ArrayList.
//
//            ArrayList<String> productos = new ArrayList<String>(10);
//
////          3. Añade las 5 instancias de Producto al ArrayList.
//
//            ArrayList<Producto> listaProductos = new ArrayList<>();
//            Producto p1 = new Producto("Camiseta",23, "Rojo", "M");
//            listaProductos.add(p1);
//
//            Producto p2 = new Producto("Pantalon",43, "Verde", "42");
//            listaProductos.add(p2);
//
//            Producto p3 = new Producto("Chaqueta",56, "Amarilla", "XS");
//            listaProductos.add(p3);
//
//            Producto p4 = new Producto("Zapatillas",79, "Negras", "42");
//            listaProductos.add(p4);
//
//            Producto p5 = new Producto("Jersey",81, "Morado", "L");
//            listaProductos.add(p5);
//
////          4. Visualiza el contenido de ArrayList utilizando Iterator
//
//            System.out.println("\n" + "Visualiza el contenido con Iterator: " + "\n" );
//
//            for (Producto producto : listaProductos) {
//                    System.out.println(producto);
//                }
//
////          5. Elimina dos elementos del ArrayList.
//
//                    int index = -1;
//                    for (Producto p : listaProductos) {
//                        System.out.println("\n" + "Recorriendo elementos despues de haber eleminado P1" + "\n");
//                        if(p1.getNombre().equals(p1.getNombre())){
//                            index = listaProductos.indexOf(p);
//                            break;
//                        }
//                    }
//
//                    listaProductos.remove(index);
//                    System.out.println("\n" + "Elimine elemento y recorro list para verificar: " + "\n");
//                    for (Producto producto : listaProductos) {
//                        System.out.println(producto);
//                    }
//
////           6. Inserta un nuevo objeto producto en medio de la lista.
//
//                    listaProductos.add(3, new Producto("guantes", 20, "negro", "S"));
//
////          7. Visualiza de nuevo el contenido de ArrayList utilizando Iterator
//
//                    System.out.println("\n" + "Recorriendo elementos despues de añadir guantes" + "\n");
//                    for (Producto producto : listaProductos) {
//                        System.out.println(producto);
//                    }
//
////          8. Ordena la lista por el nombre del producto (hay que usar el metodo sort y el
////          compateTo)
//                    System.out.println("\n" + "Ordenado con sort y compareTo nombre: " + "\n");
//
//                    listaProductos.sort(Comparator.comparing(Producto::getNombre));
//                    for (Producto producto : listaProductos) {
//                        System.out.println(producto);
//                    }

    // LinkedList:

//          1. Crea 5 instancias de la Clase Producto.
//          2. Crea un ArrayList.

        LinkedList<String> productos = new LinkedList<>();

//          3. Añade las 5 instancias de Producto al ArrayList.

        LinkedList<Producto> listaProductos = new LinkedList<>();
        Producto p1 = new Producto("Camiseta",23, "Rojo", "M");
        listaProductos.addFirst(p1);

        Producto p2 = new Producto("Pantalon",43, "Verde", "42");
        listaProductos.add(p2);

        Producto p3 = new Producto("Chaqueta",56, "Amarilla", "XS");
        listaProductos.add(p3);

        Producto p4 = new Producto("Zapatillas",79, "Negras", "42");
        listaProductos.add(p4);

        Producto p5 = new Producto("Jersey",81, "Morado", "L");
        listaProductos.addLast(p5);

//          4. Visualiza el contenido de ArrayList utilizando Iterator

        System.out.println("\n" + "Visualiza el contenido con Iterator: " + "\n" );

        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }

//          5. Elimina dos elementos del ArrayList.

        productos.removeFirst();
        productos.removeLast();

        int index = -1;
        for (Producto p : listaProductos) {
            System.out.println("\n" + "Recorriendo elementos despues de haber eleminado P1" + "\n");
            if(p1.getNombre().equals(p1.getNombre())){
                index = listaProductos.indexOf(p);
                break;
            }
        }

        listaProductos.remove(index);
        System.out.println("\n" + "Elimine elemento y recorro list para verificar: " + "\n");
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }

//           6. Inserta un nuevo objeto producto en medio de la lista.

        listaProductos.add(3, new Producto("guantes", 20, "negro", "S"));

//          7. Visualiza de nuevo el contenido de ArrayList utilizando Iterator

        System.out.println("\n" + "Recorriendo elementos despues de añadir guantes" + "\n");
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }

//          8. Ordena la lista por el nombre del producto (hay que usar el metodo sort y el
//          compateTo)
        System.out.println("\n" + "Ordenado con sort y compareTo nombre: " + "\n");

        listaProductos.sort(Comparator.comparing(Producto::getNombre));
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }


    }

}