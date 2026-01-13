public class Contacto {
    private  String nombre;
    private String numero;
    private String email;

    public Contacto(String nombre, String numero, String email) {
        this.nombre = nombre;
        this.numero = numero;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("====================\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Número: ").append(numero).append("\n");
        sb.append("Email:  ").append(email).append("\n");
        sb.append("====================");
        return sb.toString();
    }

}

