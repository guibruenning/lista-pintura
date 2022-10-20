package util;

public class Util {

    public static double valorQuadrado(double valor) {
        return Math.pow(valor, 2);
    }

    public static double valorRaiz(double valor) {
        return Math.sqrt(valor);
    }

    public static double valorElevado(double valor, int elevado) {
        return Math.pow(valor, elevado);
    }

    public static int arredondar(double valor) {
        return (int)Math.ceil(valor);
    }
}
