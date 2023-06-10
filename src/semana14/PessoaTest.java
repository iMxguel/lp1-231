package semana14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void testCalcularImc() {
        Pessoa pessoa = new Pessoa(1.7, 70);
        double imc = pessoa.calcularImc();
        Assertions.assertEquals(24.22, imc, 0.01); // Verifica se o resultado do IMC está próximo de 24.22
    }

    @Test
    public void testGetFaixa() {
        Pessoa pessoa1 = new Pessoa(1.7, 60);
        String faixa1 = pessoa1.getFaixa();
        Assertions.assertEquals("NORMAL", faixa1); // Verifica se o resultado do IMC indica faixa "NORMAL"

        Pessoa pessoa2 = new Pessoa(1.7, 80);
        String faixa2 = pessoa2.getFaixa();
        Assertions.assertEquals("SOBRE", faixa2); // Verifica se o resultado do IMC indica faixa "SOBRE"
    }

    @Test
    public void testGetAltura() {
        Pessoa pessoa = new Pessoa(1.7, 70);
        double altura = pessoa.getAltura();
        Assertions.assertEquals(1.7, altura);
    }

    @Test
    public void testGetPeso() {
        Pessoa pessoa = new Pessoa(1.7, 70);
        double peso = pessoa.getPeso();
        Assertions.assertEquals(70, peso);
    }

    @Test
    public void testSetAltura() {
        Pessoa pessoa = new Pessoa(1.7, 70);
        pessoa.setAltura(1.75);
        double altura = pessoa.getAltura();
        Assertions.assertEquals(1.75, altura);

        // Testando valor inválido
        pessoa.setAltura(-1.8);
        altura = pessoa.getAltura();
        Assertions.assertEquals(1.75, altura); // A altura não deve ter sido alterada
    }

    @Test
    public void testSetPeso() {
        Pessoa pessoa = new Pessoa(1.7, 70);
        pessoa.setPeso(75);
        double peso = pessoa.getPeso();
        Assertions.assertEquals(75, peso);

        // Testando valor inválido
        pessoa.setPeso(-80);
        peso = pessoa.getPeso();
        Assertions.assertEquals(75, peso); // O peso não deve ter sido alterado
    }
}

