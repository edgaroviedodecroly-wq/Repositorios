public enum Genero {
    DRAMA,
    TERROR,
    COMEDIA,
    FICCION;

    public static void getMostrarGeneros()
    {
        for (int contador = 1; contador <= Genero.values().length; contador++) {
            String mensaje = contador + " - " + Genero.values()[contador-1].toString();
            System.out.println(mensaje);
        }
    }
}
