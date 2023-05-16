package semana12;

public class Aquario {
    public double comprimento;
    public double altura;
    public double largura;

    public Aquario(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularVolume(double comprimento, double altura, double largura) {
        return comprimento * altura * largura;
    }

}
