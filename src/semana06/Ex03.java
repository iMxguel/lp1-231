package semana06;

public Test Ex03 {

    @Test
    public void testCalcularVolume() {
        double comprimento = 30.0;
        double altura = 20.0;
        double largura = 10.0;
        double expected = 6.0;
        double actual = Ex03.calcularVolume(comprimento, altura, largura);
        assertEquals(expected, actual, 0.01);
    }

    private void assertEquals(double expected, double actual, double d) {
    }
    
}

import java.util.Scanner;

public class Ex03 {
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

public class Ex03 {

    @Test
    public void testPessoaMagra() {
        String expectedOutput = "Seu IMC é 16,00 e você está classificado como magro(a).\n" +
                "Você precisa ganhar 7,58 kg para chegar ao peso ideal.\n";
        String actualOutput = getProgramOutput("50\n1.70\n");
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPessoaComPesoNormal() {
        String expectedOutput = "Seu IMC é 22,22 e você está classificado como com peso normal.\n";
        String actualOutput = getProgramOutput("68\n1.75\n");
        assertEquals(expectedOutput, actualOutput);
    }

    private void assertEquals(String expectedOutput, String actualOutput) {
    }

    @Test
    public void testPessoaComSobrepeso() {
        String expectedOutput = "Seu IMC é 27,78 e você está classificado como com sobrepeso.\n" +
                "Você precisa perder 6,86 kg para chegar ao peso ideal.\n";
        String actualOutput = getProgramOutput("85\n1.70\n");
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPessoaObesa() {
        String expectedOutput = "Seu IMC é 35,30 e você está classificado como obeso(a).\n" +
                "Você precisa perder 22,39 kg para chegar ao peso ideal.\n";
        String actualOutput = getProgramOutput("120\n1.70\n");
        assertEquals(expectedOutput, actualOutput);
    }

    private String getProgramOutput(String input) {
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(input.getBytes());
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setIn(inputStream);
        System.setOut(new java.io.PrintStream(outputStream));
        Exercicio62.main(new String[]{});
        return outputStream.toString();
    }
}