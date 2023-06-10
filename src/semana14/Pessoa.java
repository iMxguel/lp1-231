package semana14;

public class Pessoa {
    private double altura;
    private double peso;

    public Pessoa(double altura, double peso) {
        setAltura(altura);
        setPeso(peso);
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }

    public String getFaixa() {
        double imc = calcularImc();
        if (imc < 18.5) {
            return "MAGRO";
        } else if (imc < 25) {
            return "NORMAL";
        } else if (imc < 30) {
            return "SOBRE";
        } else {
            return "OBESO";
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Valor inválido. A altura deve ser maior que 0.");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Valor inválido. O peso deve ser maior que 0.");
        }
    }
}
