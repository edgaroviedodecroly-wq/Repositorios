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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }

    public int getNumMovimientos() {
        return numMovimientos;
    }

    public void setNumMovimientos(int numMovimientos) {
        this.numMovimientos = numMovimientos;
    }


    public boolean ingreso(double cantidad, String fecha) {

        if (cantidad <= 0){
            System.out.println("Cantidad Invalida");
            return false;
        }
        saldo += cantidad;

        if(cantidad > 3000) {
            System.out.println("AVISO: Notificar Hacienda.");
        }

        Movimiento mov = new Movimiento(numMovimientos + 1, fecha, "Ingreso", cantidad);

        movimientos[numMovimientos] = mov;
        numMovimientos++;

        return true;
    }

    public boolean retirada(double cantidad, String fecha) {

        if (cantidad <= 0) {
            System.out.println("Cantidad Invalida");
            return false;
        }
        if (saldo - cantidad < LIMITE_DESCUBIERTO)
            System.out.println("No puedes retirar esa cantidad, Saldo Insuficiente.");

        saldo -= cantidad;

        if (saldo <  0) {
            System.out.println("Saldo Negativo");
        }

        if  (cantidad > 3000) {
            System.out.println("AVISO: Notificar Hacienda.");
        }

        Movimiento mov = new Movimiento(numMovimientos + 1,  fecha,  "retirada", cantidad);
        movimientos[numMovimientos] = mov;
        numMovimientos++;

        return false;
    }

    public String mostrarDatos(){
        String datos = "";
        datos += "Iban: " + this.iban + "\n";
        datos += "Titular: " + this.titular + "\n";
        datos += "Saldo: " + this.saldo + "\n";;

        return datos;
    }

    public int NumMovimientos() {
        return numMovimientos;
    }
}
