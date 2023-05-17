package semana11;

public class Pessoa {
    public double altura;
    public double peso;

    public Pessoa(double d, double e) {
	}

	public static double calcularImc() {
        return peso / (altura * altura);
    }

    public static String getFaixa() {
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

    public String getSituacao(double peso2, double altura2) {
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
