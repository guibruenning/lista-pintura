package piramide;

import util.Util;

import java.util.Arrays;

public class Piramide {

    private double altura;
    private double arestaBase;

    final double rendimento = 4.76;
    private int option;
    final private double[] VALOR_PIRAMIDE = {127.90, 258.98,344.34};

    public Piramide(double altura, double arestaBase, int option) {
        setAltura(altura);
        setArestaBase(arestaBase);
        setOption(option);
    }
    public Piramide() {
    }

    public double a1(){
        return Util.valorRaiz(Util.valorQuadrado(arestaBase) + Util.valorQuadrado(altura));
    }

    public double areaBase(){
        return Util.valorQuadrado(arestaBase * 2);
    }

    public double areaTriangulo(){
        return ((arestaBase * 2) * a1()) / 2;
    }

    public double areaTotal(){
        return areaBase() + (areaTriangulo() * 4);
    }

    public double litros(){
        return areaTotal() / rendimento;
    }

    public double latas(){
        return Util.arredondar(litros() / 18);
    }

    public double valor(){
        return latas() * VALOR_PIRAMIDE[option];
    }

    public double volume(){
        return (areaBase() * altura) / 3;
    }

    public double getAltura() {
        return altura;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        if (option >= 0 && option <= 2) {
            this.option = option;
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        if (arestaBase > 0) {
            this.arestaBase = arestaBase;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ab: ").append(arestaBase);
        sb.append("\nh: ").append(altura);
        sb.append("\na1: ").append(a1());
        sb.append("\nAreaTriangulo: ").append(areaTriangulo());
        sb.append("\nAreaBase: ").append(areaBase());
        sb.append("\nAreaTotal: ").append(areaTotal());
        sb.append("\nTipo de tinta: ").append(option + 1);
        sb.append("\nLitros: ").append(litros());
        sb.append("\nLatas: ").append(latas());
        sb.append("\nValor: ").append(valor());
        sb.append("\nVolume: ").append(volume());

        return sb.toString();
    }
}
