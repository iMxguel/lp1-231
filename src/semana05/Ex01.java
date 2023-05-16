package semana05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

    try (Scanner sc = new
Scanner (System.in)) {
        System.out.println("Digite o comprimento do aquario em centimetros:");
        double comprimento = sc.nextDouble();

        System.out.println("Digite a altura do aquario em cm:");
        double altura = sc.nextDouble();

        System.out.println("Digite a largura do aquario en cm:"); 
        double largura = sc.nextDouble();
  
        double volume = (comprimento * altura * largura)/1000; 
        System.out.println("O volume do aquario é:"); 
        System.out.println(volume);

        System.out.println("A temperatura ambiente é:");
        float temperaturaambiente = sc.nextFloat();

        System.out.println("Digite a temperatura desejada em graus Celcius:");
        double temperaturadesejada = sc.nextDouble();
        
        double potenciatermostato = volume * 0.05 * (temperaturadesejada - temperaturaambiente);
        System.out.println("A potencia do termostato é:");
        System.out.println(potenciatermostato);
    }


    

   }
}