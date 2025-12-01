public class CuentaBancaria {
    private String iban;
    private String titular;
    private double saldo;
    private Movimiento[] movimientos;
    private int numMovimientos;

    private static final double LIMITE_DESCUBIERTO = -50.0;

    public CuentaBancaria(String iban, String titular){
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new Movimiento[100];
        this.numMovimientos = 0;


    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }


    // Metodo para ingresos, hago un if para validar la cantidad minima y otro para la maxima.

    public boolean ingreso(double cantidad) {

        if (cantidad <= 0){
            System.out.println("Cantidad Invalida");
            return false;
        }

        //Saldo se suma a cantidad.
        saldo += cantidad;

        if(cantidad > 3000) {
            System.out.println("AVISO: Notificar Hacienda.");
        }

        // Creo un objeto Movimiento sumandole 1 a numMovimiento y indicando tipo, cantidad.
        Movimiento mov = new Movimiento(numMovimientos + 1, "Ingreso", cantidad);

        //Inserto el movimiento en el array
        movimientos[numMovimientos] = mov;

        // le sumo uno para que en los siguientes insertos se ponga en la siguiente posicion.
        numMovimientos++;

        // Devuelto true si la operecion salio bien.
        return true;
    }

    // Metodo para retirada

    public boolean retirada(double cantidad) {

        //  if para cantidad invalidad.
        if (cantidad <= 0) {
            System.out.println("Cantidad Invalida");
            return false;
        }
        // If si saldo - catidad es menor a limite_descubierto. entonces no permite retirar.
        if (saldo - cantidad < LIMITE_DESCUBIERTO) {
            System.out.println("No puedes retirar esa cantidad, Saldo Insuficiente.");
            return false;
        }

        // Se descuenta la retirada de la cantida.
        saldo -= cantidad;

        // Si la cuenta queda en engativo imprrime aviso.
        if (saldo <  0) {
            System.out.println("Saldo Negativo");
        }

        // Si se retira mas de 3000, aviso a hacienda.
        if  (cantidad > 3000) {
            System.out.println("AVISO: Notificar Hacienda.");
        }

        // creo el objeto movimiento y lo guardo en el array y le sumo uno para futuros registros.
        Movimiento mov = new Movimiento(numMovimientos + 1, "retirada", cantidad);
        movimientos[numMovimientos] = mov;
        numMovimientos++;

        return true;
    }

    public String mostrarDatos(){
        String datos = "";
        datos += "Iban: " + this.iban + "\n";
        datos += "Titular: " + this.titular + "\n";
        datos += "Saldo: " + this.saldo + "€\n";;

        return datos;
    }

    public int NumMovimientos() {
        return numMovimientos;
    }

}
