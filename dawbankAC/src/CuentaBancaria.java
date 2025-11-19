public class CuentaBancaria {
    private String iban;
    private String titular;
    private double saldo;
    private Movimientos[] movimientos;
    private int numMovimientos;

    private static final double LIMITE_DESCUBIERTO = -50.0;
    public CuentaBancaria(String iban, String titular, double saldo, Movimientos[] movimientos, int numMovimientos) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
        this.movimientos = new Movimientos[100];
        this.numMovimientos = numMovimientos;


    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Movimientos[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimientos[] movimientos) {
        this.movimientos = movimientos;
    }

    public int getNumMovimientos() {
        return numMovimientos;
    }

    public void setNumMovimientos(int numMovimientos) {
        this.numMovimientos = numMovimientos;
    }


    public boolean ingreso(double cantidad, String fecha, String tipo) {

        if (cantidad <= 0){
            System.out.println("Cantidad Invalida");
            return false;
        }
        saldo += cantidad;

        if(cantidad > 3000) {
            System.out.println("AVISO: Notificar Hacienda.");
        }

        Movimientos mov = new Movimientos(numMovimientos + 1,  fecha,  "ingreso", cantidad);

        movimientos[numMovimientos] = mov;
        numMovimientos++;

        return true;
    }

    public boolean retirada(double cantidad, String fecha, String tipo) {

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

        return false;
    }

    public String mostrarDatos(){
        String mostarDatos = "";
        mostarDatos = "Iban: " + this.iban + "\n";
        mostarDatos = "Titular: " + this.titular + "\n";
        mostarDatos = "Saldo: " + this.saldo + "\n";;

        return mostarDatos;
    }
}
