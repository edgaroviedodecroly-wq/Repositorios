import java.util.Arrays;

public class Agenda {
    private Agenda [] miAgenda;
    private int contactosActuales;

    //Contrustor

    public Agenda(Agenda[] miAgenda, int capacidad) {
        this.miAgenda = miAgenda;
        this.miAgenda = new Agenda[capacidad];
        this.contactosActuales = 0;
    }

    //Añadir contacto

    public boolean AddContacto(Agenda newContacto){
        boolean valida = false;
        
        if(contactosActuales < this.miAgenda.length){
            this.miAgenda[contactosActuales] = newContacto;
            this.contactosActuales++;
            valida = true;
        }
        return valida;

    }


    //toString

}
