package semana12;

public class Aquario {
    private double comprimento;
    private double altura;
    private double largura;

    public Aquario(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public Aquario(double valorUnico) {
        this.comprimento = valorUnico;
        this.altura = valorUnico;
        this.largura = valorUnico;
    }

    public double calcularVolume() {
        return (comprimento * altura * largura) / 1000.0;
    }

    public double calcularPotenciaDoTermostato(float temperaturaAmbiente, double temperaturaDesejada) {
        double volume = calcularVolume();
        return volume * 0.05 * (temperaturaDesejada - temperaturaAmbiente);
    }

    public double calcularQuantidadeLitrosFiltro(double taxaDeFiltragem) {
        double volume = calcularVolume();
        return volume * taxaDeFiltragem;
    }

    public Double getLargura() {
        return null;
    }

    public Double getComprimento() {
        return null;
    }

    public Double getAltura() {
        return null;
    }
}
