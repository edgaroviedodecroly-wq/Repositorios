public class Movimientos {
    private int id;
    private String fecha;
    private String tipo;
    private double cantidad;

    //Contrutores
    public Movimientos(int id, String fecha, String tipo, double cantidad) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    // metodos

    public String mostrarInfoMovimiento(){
     String mostrarInfoMovimiento = "";
     mostrarInfoMovimiento = "Id: " + this.id + "\n";
     mostrarInfoMovimiento = "Fecha: " + this.fecha + "\n";
     mostrarInfoMovimiento = "Tipo: " + this.tipo + "\n";
     mostrarInfoMovimiento = "Cantidad: " + this.cantidad + "\n";

     return mostrarInfoMovimiento;
    }

}
