package semana06;

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
    
            float volumeLitros = (float) (volume / 1000.0);
            System.out.printf("O volume do aquário é litros %.2f", volumeLitros);
            System.out.println(volumeLitros);
    
            System.out.println("A temperatura ambiente é:");
            float temperaturaambiente = sc.nextFloat();
    
            System.out.println("Digite a temperatura desejada em graus Celcius:");
            double temperaturadesejada = sc.nextDouble();
            
            double potenciatermostato = volume * 0.05 * (temperaturadesejada - temperaturaambiente);
            System.out.println("A potencia do termostato é:");
            System.out.println(potenciatermostato);
        
            double potenciaTermostato = (volumeLitros / 100.0) * 5.0;
            System.out.printf("A potência do termostato necessária é de %.2f watts.\n", potenciaTermostato);
    
            double filtragemLitrosHora = volumeLitros / 3.0;
            System.out.printf("A quantidade de filtragem por hora necessária é de %.2f litros.\n", filtragemLitrosHora);
    
        
        
        
        }
    
    
        
    
       }

    public static double calcularVolume(double comprimento, double altura, double largura) {
        return 0;
    }
    }
