package cone;

import util.Util;
import util.Enum;
public class Cone {
    private double radius;
    private double height;

    private int option;
    final private double RENDIMENTO = 3.45;
    final private double[] options = {238.90,467.98,758,34};


    public Cone() {
        this.radius = 0;
        this.height = 0;
        this.option = 0;
    }

    public Cone(double radius, double height, int option) {
        this.radius = radius;
        this.height = height;
        this.option = option;
    }

    public double geratriz() {
        return Util.valorRaiz(Util.valorQuadrado(radius) + Util.valorQuadrado(height));
    }

    public double areaLateral() {
        return Enum.PI.getValor() * radius * geratriz();
    }

    public double areaTotal() {
        return Enum.PI.getValor() * radius * (radius + geratriz());
    }

    public double areaBase() {
        return Enum.PI.getValor() * Util.valorQuadrado(radius);
    }

    public double litros() {
        return this.areaTotal() * RENDIMENTO;
    }

    public int latas() {
        return Util.arredondar(this.litros() / Enum.LITRO.getValor());
    }

    public double valorTotal() {
        return latas() * options[option];
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        if(option >= 0 && option <= 2) {
            this.option = option;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Raio: ").append(getRadius());
        sb.append("\nAltura: ").append(getHeight());
        sb.append("\nNivel: ").append(option+1);
        sb.append("\n------------------------------------------------\n");
        sb.append("\nGeratriz: ").append(geratriz());
        sb.append("\n------------------------------------------------\n");
        sb.append("\nArea do fundo: ").append(areaBase());
        sb.append("\nArea Lateral Cone: ").append(areaLateral());
        sb.append("\nArea Total: ").append(areaTotal());
        sb.append("\n------------------------------------------------\n");
        sb.append("\nLitros: ").append(litros());
        sb.append("\nLatas: ").append(latas());
        sb.append("\n------------------------------------------------\n");
        sb.append("\nValor Total: ").append(valorTotal());
        return sb.toString();
    }
}