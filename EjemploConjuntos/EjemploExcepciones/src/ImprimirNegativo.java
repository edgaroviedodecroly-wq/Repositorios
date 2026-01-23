public class ImprimirNegativo extends RuntimeException{

    public void imprimNegativo(int n){
            if (n >= 0 ) throw new ImprimirNegativo(); {
                System.out.println(n);
            }
    }
}
