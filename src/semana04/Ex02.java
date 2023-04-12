package semana04;

import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new 
        Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = input.nextDouble();

        double media = (num1 + num2 + num3) / 3;
        System.out.println("A média aritmética é: " + media);

        input.close();
    
        
      
    
    }
}