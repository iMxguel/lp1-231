package semana04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();

        System.out.println("Antecessor: " + (num - 1));
        System.out.println("Número digitado: " + num);
        System.out.println("Sucessor: " + (num + 1));

        input.close();
    }
}
