package semana12;

public class Pessoa {
    public double altura;
    public double peso;
    
    public double IMC (double altura, double peso) {
        return peso / (altura * altura);
    }

}
