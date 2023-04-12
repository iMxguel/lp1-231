package semana06;

import java.util.Scanner;

public class Ex02 {
    
           public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f e você está classificado como ", imc);

        if (imc < 18.5) {
            System.out.println("magro(a).");
            double pesoIdeal = 24.9 * (altura * altura);
            double pesoParaGanhar = pesoIdeal - peso;
            System.out.printf("Você precisa ganhar %.2f kg para chegar ao peso ideal.\n", pesoParaGanhar);
        } else if (imc < 25) {
            System.out.println("com peso normal.");
        } else if (imc < 30) {
            System.out.println("com sobrepeso.");
            double pesoIdeal = 24.9 * (altura * altura);
            double pesoParaPerder = peso - pesoIdeal;
            System.out.printf("Você precisa perder %.2f kg para chegar ao peso ideal.\n", pesoParaPerder);
        } else {
            System.out.println("obeso(a).");
            double pesoIdeal = 24.9 * (altura * altura);
            double pesoParaPerder = peso - pesoIdeal;
            System.out.printf("Você precisa perder %.2f kg para chegar ao peso ideal.\n", pesoParaPerder);
        }

        scanner.close();
    }
     }