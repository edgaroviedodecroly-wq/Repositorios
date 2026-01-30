import java.util.ArrayList;
import java.util.HashMap;

public class CuentaBancaria {
    private String iban;
    private String cliente;
    private double saldo;
    private HashMap<String, ArrayList<Movimiento>> movimientos;
    private int numMovimientos;

    private static final double LIMITE_DESCUBIERTO = -50.0;

    public CuentaBancaria(String iban, String cliente){
        this.iban = iban;
        this.cliente = cliente;
        this.saldo = 0;
        this.movimientos = new HashMap<>();
        this.numMovimientos = 0;


    }

    public String getIban() {
        return iban;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public HashMap<String, ArrayList<Movimiento>> getMovimientos() {
        return movimientos;
    }


    // Metodo para ingresos, hago un if para validar la cantidad minima y otro para la maxima.

    public boolean ingreso(double cantidad) throws AvisarHaciendaException{

        if (cantidad <= 0){
            throw new IllegalArgumentException("Cantidad Invalida");
        }

        //Saldo se suma a cantidad.
        saldo += cantidad;

        if(cantidad > 3000) {
            throw new AvisarHaciendaException("AVISO: Notificar Hacienda.");
        }

        // Creo un objeto Movimiento sumandole 1 a numMovimiento y indicando tipo, cantidad.
        Movimiento mov = new Movimiento(numMovimientos + 1, "Ingreso", cantidad);

        //Inserto el movimiento en el array
//        movimientos[numMovimientos] = mov;
        movimientos.putIfAbsent(iban, new ArrayList<>());
        movimientos.get(iban).add(mov);

        // le sumo uno para que en los siguientes insertos se ponga en la siguiente posicion.
        numMovimientos++;

        // Devuelto true si la operecion salio bien.
        return true;
    }

    // Metodo para retirada

    public boolean retirada(double cantidad) throws AvisarHaciendaException  {

        //  if para cantidad invalidad.
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad Invalida");
        }
        // If si saldo - catidad es menor a limite_descubierto. entonces no permite retirar.
        if (saldo - cantidad < LIMITE_DESCUBIERTO) {
            throw new IllegalStateException("No puedes retirar esa cantidad, Saldo Insuficiente.");
        }

        // Se descuenta la retirada de la cantida.
        saldo -= cantidad;

        // Si la cuenta queda en engativo imprrime aviso.
        if (saldo <  0) {
            System.out.println("Saldo Negativo");
        }

        // Si se retira mas de 3000, aviso a hacienda.
        if  (cantidad > 3000) {
                throw new AvisarHaciendaException("AVISO: Notificar Hacienda.");
        }

        // creo el objeto movimiento y lo guardo en el array y le sumo uno para futuros registros.
        Movimiento mov = new Movimiento(numMovimientos + 1, "retirada", cantidad);
        movimientos.putIfAbsent(iban, new ArrayList<>());
        movimientos.get(iban).add(mov);


        return true;
    }

    public static void validarIban(String iban) throws IbanInvalidoException {
        if (!iban.matches("^[A-Z]{2}[0-9]{22}$")) {
            throw new IbanInvalidoException("ERROR: Introduce un IBAN correcto.");
        }
    }

    public static void validarNombre(String cliente) throws NombreInvalido {
        if (!cliente.matches("^[A-Za-z]{3,}$")) {
            throw new NombreInvalido("ERROR: El campo de titular tiene que estar completado.");
        }
    }


    public String mostrarDatos(){
        String datos = "";
        datos += "Iban: " + this.iban + "\n";
        datos += "Titular: " + this.cliente + "\n";
        datos += "Saldo: " + this.saldo + "€\n";;

        return datos;
    }

    public int NumMovimientos() {
        return numMovimientos;
    }

}
