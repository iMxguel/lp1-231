package semana04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valor = input.nextDouble();

        double desconto = 0;
        if (valor >= 0.01 && valor < 10) {
            desconto = 0;
        } else if (valor < 100) {
            desconto = 0.05;
        } else if (valor < 500) {
            desconto = 0.1;
        } else {
            desconto = 0.15;
        }

        double valorDesconto = valor * desconto;
        double valorFinal = valor - valorDesconto;

        System.out.println("Valor da compra: R$ " + valor);
        System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final com desconto: R$ " + valorFinal);

        input.close();
    }
}
