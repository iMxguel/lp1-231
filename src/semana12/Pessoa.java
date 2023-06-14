package semana12;

public class Pessoa {
    public double altura;
    public double peso;
<<<<<<< HEAD

    public Pessoa(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public static double calcularImc(double altura, double peso) {
        return peso / (altura * altura);
    }

    public static String getFaixa(double altura, double peso) {
        double imc = calcularImc(altura, peso);
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

    
    }

=======
    
    public double IMC (double altura, double peso) {
        return peso / (altura * altura);
    }

}
>>>>>>> b5c7d61309e2ca3db91067eb4c187d4b937d9081
