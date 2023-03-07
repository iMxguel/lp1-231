# Aulas de LP1

Repositório destinado ao conteúdo de lp1;


## Conteúdo

 - Semana 1

    - apresentação da disciplina

- Semana 2

     - introdução ao git e github

- Semana 3

    - Criação de projeto java

package semana03;

import java.util.Scanner;

public class introducao {
    
    public static void main (String[] args) {
       // Comentário de linha

       /*
        * Comentários de múltiplas linhas
        */

        // Tipos Primitivos
        // byte, short, int, long

        byte n1= 100; // 1 bytes- 128 a 127
        short n2 = 3000; //2 bytes-32768 a 32767
        int n3= 400000; // 4 bytes 2 bilhoes
        long n4= 323232323232l; // 8 bytes

        // Ponto flutuante
        // float, double
        float nota1 = 9.5f; // 4 bytes
        double nota2 = 9.5; // 8 bytes

        // char
         char letra = 'A';

         // boolen
         boolean ligado = true;
         boolean desligado = false;

         //string
         String palavra = "olá mundo";
         System.out.println(palavra);
         System.out.println(palavra.toLowerCase());
         System.out.println(palavra.toUpperCase());

         // variáveis e constantes
         // Tipo nome = valor;
         // tipo nome;
         // nome = valor;

         short idade= 30;// boa prática
         short idade2;
         idade =30; // má prática

         // Java 10 - inferência de tipos
         var sobrenome = "Santos";
         var idade3= 25;

       // Constantes
    final double TESTE = 30.4;

    // Entrada e saída de dados
    // instancia um objeto Scanner para receber
    // dados do usuario
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre com o seu nome");
   String  nomeInformado = sc.nextLine();
    System.out.println("entre com a sua idade");
    int idadeInformado = sc.nextShort();
    System.out.println(nomeInformado + " "+ idadeInformado);
      // fecha o objeto scanner liberando
      // os recursos alocados
    sc. close();
}
}
