package semana14;

public class Aquario {
    private double comprimento;
    private double altura;
    private double largura;

    public Aquario(double comprimento, double altura, double largura) {
        setComprimento(comprimento);
        setAltura(altura);
        setLargura(largura);
    }

    public Aquario(double valorUnico) {
        setComprimento(valorUnico);
        setAltura(valorUnico);
        setLargura(valorUnico);
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

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("Valor inválido. A largura deve ser maior que 0.");
        }
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0) {
            this.comprimento = comprimento;
        } else {
            System.out.println("Valor inválido. O comprimento deve ser maior que 0.");
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Valor inválido. A altura deve ser maior que 0.");
        }
    }
}
