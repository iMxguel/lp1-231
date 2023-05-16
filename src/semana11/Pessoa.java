package semana11;

public class Pessoa {
    public double altura;
    public double peso;

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
            return "SOBREPESO";
        } else {
            return "OBESO";
        }
    }

    public String getSituacao() {
        double imc = calcularImc();
        if (imc < 18.5) {
            return "GANHAR";
        } else if (imc < 25) {
            return "NORMAL";
        } else if (imc < 30) {
            return "PERDER";
        } else {
            return "PERDER";
        }
    }
}
