public class ImprimirPositivo extends RuntimeException{

    public void imprimirPositivo(int p) {
            if (p < 0 ) throw new ImprimirPositivo(); {
                System.out.println("Correcto");
            }
    }
}
