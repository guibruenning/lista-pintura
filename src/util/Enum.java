package util;

public enum Enum {
    LITRO(18),
    PI(3.14);

    private double valor;

    Enum(double valor) {
        this.valor = valor;
    }
    Enum() {
    }

    public double getValor() {
        return valor;
    }
}
