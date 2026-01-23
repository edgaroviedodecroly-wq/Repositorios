public class ImprimirPositivo extends RuntimeException{

    public void imprimirNegativo(int p) {
            if (p < 0 ) throw new ImprimirPositivo(); {
                System.out.println(p);
            }
    }
}
