package semana04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o código do funcionário: ");
        String codigo = input.nextLine().toUpperCase();

        if (codigo.matches("BR\\d{4}X")) {
            System.out.println("Código válido!");
        } else {
            System.out.println("Código inválido!");
        }

        input.close();
    }
}