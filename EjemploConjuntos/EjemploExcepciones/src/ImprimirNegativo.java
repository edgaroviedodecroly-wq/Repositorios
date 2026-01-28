public class ImprimirNegativo extends RuntimeException{

    public void imprimirNegativo(int n){
            if (n >= 0 ) throw new ImprimirNegativo(); {
                System.out.println("Correcto");
            }
    }


}
