inport java.net.CacheRequest;

public class ejercicio3 {

    public static int sumarTresValores(int a, int b, int c) {
        int sumar = a + b + c;
        return sumar;
    }

    public static void main(String [] args) {
        int resultado = sumarTresValores (a: 2, b: 10, c: 15);
        System.out.println("la suma de tres valores es: " + resultado);
    }
}


