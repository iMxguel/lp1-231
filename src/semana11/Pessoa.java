package semana11;

public class Pessoa {
<<<<<<< HEAD
    public static double altura;
    public static double peso;

    public Pessoa(double d, double e) {
	}

	public static double calcularImc() {
        return peso / (altura * altura);
    }

    public static String getFaixa() {
=======
    public double altura;
    public double peso;

    public double calcularImc() {
        return peso / (altura * altura);
    }

    public String getFaixa() {
>>>>>>> b5c7d61309e2ca3db91067eb4c187d4b937d9081
        double imc = calcularImc();
        if (imc < 18.5) {
            return "MAGRO";
        } else if (imc < 25) {
            return "NORMAL";
        } else if (imc < 30) {
<<<<<<< HEAD
            return "SOBRE";
=======
            return "SOBREPESO";
>>>>>>> b5c7d61309e2ca3db91067eb4c187d4b937d9081
        } else {
            return "OBESO";
        }
    }

<<<<<<< HEAD
    public String getSituacao(double peso2, double altura2) {
=======
    public String getSituacao() {
>>>>>>> b5c7d61309e2ca3db91067eb4c187d4b937d9081
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
