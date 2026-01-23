public class ExcesoVelocidadException extends RuntimeException {


    private static final long serialVersionUID = 9107824086742887629L;

    private int velocidad;

    public ExcesoVelocidadException(int Velocidad, String mensaje) {

        super("Exceso de velocidad: " + Velocidad + " " + mensaje);
    }
}
