import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movimiento {
    private int id;
    private String fecha;
    private String tipo;
    private double cantidad;

    // COSTRUCTORES


    public Movimiento (int id, String tipo, double cantidad) {

        // Importo LocalDate y creo FechaActual igualandola a su metodo para que me de la fecha actual siempre.
        LocalDate fechaActual = LocalDate.now();
        // Introduzco el formato en el que quiero que se muestre la fecha.
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        this.id = id;
        this.fecha = fechaActual.format(formato);
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    // METODOS


    // Metodo para mostrar la iformacion de los movimientos.
    public String mostrarInfoMovimiento(){
     String mostrarInfoMovimiento = "";
     mostrarInfoMovimiento += "Id: " + this.id + "\n";
     mostrarInfoMovimiento += "Fecha: " + this.fecha + "\n";
     mostrarInfoMovimiento += "Tipo: " + this.tipo + "\n";
     mostrarInfoMovimiento += "Cantidad: " + this.cantidad +  "€\n";

     return mostrarInfoMovimiento;
    }

}
