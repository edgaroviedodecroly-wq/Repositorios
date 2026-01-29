import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {
    private int id;
    private LocalDateTime fecha;
    private String tipo;
    private double cantidad;


    // Introduzco el formato en el que quiero que se muestre la fecha.
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    // COSTRUCTORES

    public Movimiento (int id, String tipo, double cantidad) {



        this.id = id;
        this.fecha = LocalDateTime.now();
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    // METODOS


    // Metodo para mostrar la iformacion de los movimientos.
//    public String mostrarInfoMovimiento(){
//     String mostrarInfoMovimiento = "";
//     mostrarInfoMovimiento += "Id: " + this.id + "\n";
//     mostrarInfoMovimiento += "Fecha: " + this.fecha + "\n";
//     mostrarInfoMovimiento += "Tipo: " + this.tipo + "\n";
//     mostrarInfoMovimiento += "Cantidad: " + this.cantidad +  "€\n";
//
//     return mostrarInfoMovimiento;
//    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("====================\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Fecha: ").append(fecha.format(formato)).append("\n");
        sb.append("Tipo: ").append(tipo).append("\n");
        sb.append("Cantidad: ").append(cantidad).append("\n");
        sb.append("====================");
        return sb.toString();
    }



}
