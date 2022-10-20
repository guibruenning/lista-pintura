package cubo;

import util.Util;
import util.Enum;

public class Cube {

    private double lateral;

    private double rendimento;

    private int option;

    final private double[] VALOR_TIPO = {101.90, 212.45, 345.56};

    public Cube(double lateral, double rendimento, int option) {
        setLateral(lateral);
        setRendimento(rendimento);
        setOption(option);
    }
    public Cube() {
        this.lateral = 0;
    }

    public double areaBase() {
        return Util.valorQuadrado(this.lateral);
    }

    public double arealTotal(){
        return 6 * this.areaBase();
    }

    public double volume() {
        return Util.valorElevado(this.lateral, 3);
    }

    public double diagonal() {
        return Util.valorRaiz(3) * this.lateral;
    }

    public double litros() {
        return this.arealTotal() / rendimento ;
    }

    public double latas() {
        return Util.arredondar(this.litros() / Enum.LITRO.getValor());
    }

    public double valorTotal() {
        return this.latas() * VALOR_TIPO[option];
    }

    public double getRendimento() {
        return rendimento;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        if (option >= 0 && option < VALOR_TIPO.length) {
            this.option = option;
        }
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public double getLateral() {
        return lateral;
    }

    public void setLateral(double lateral) {
        this.lateral = lateral;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("a: ").append(lateral);
        sb.append("\nRendimento: ").append(rendimento);
        sb.append("\ntipo de tinta: ").append(option);
        sb.append("\n--------------------------------------\n");
        sb.append("\nArea da base: ").append(areaBase());
        sb.append("\nArea total: ").append(arealTotal());
        sb.append("\nVolume: ").append(volume());
        sb.append("\nDiagonal do cubo: ").append(diagonal());
        sb.append("\nLitros de Tinta: ").append(litros());
        sb.append("\nLatas de Tinta: ").append(latas());
        sb.append("\nValor Total: ").append(valorTotal());
        return sb.toString();
    }
}
