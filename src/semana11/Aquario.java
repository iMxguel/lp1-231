package semana11;

public class Aquario {
    private double comprimento;
    private double altura;
    private double largura;

    public Aquario(double comprimento, double altura, double largura) {
<<<<<<< HEAD
=======
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
>>>>>>> b5c7d61309e2ca3db91067eb4c187d4b937d9081
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
}
