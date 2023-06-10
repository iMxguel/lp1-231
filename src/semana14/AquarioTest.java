package semana14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AquarioTest {

    @Test
    public void testCalcularVolume() {
        Aquario aquario = new Aquario(10, 5, 3);
        double volume = aquario.calcularVolume();
        Assertions.assertEquals(0.15, volume);
    }

    @Test
    public void testCalcularPotenciaDoTermostato() {
        Aquario aquario = new Aquario(10, 5, 3);
        double potencia = aquario.calcularPotenciaDoTermostato(25, 30);
        Assertions.assertEquals(0.0375, potencia);
    }

    @Test
    public void testCalcularQuantidadeLitrosFiltro() {
        Aquario aquario = new Aquario(10, 5, 3);
        double quantidadeLitros = aquario.calcularQuantidadeLitrosFiltro(0.8);
        Assertions.assertEquals(0.12, quantidadeLitros);
    }

    @Test
    public void testGetSetLargura() {
        Aquario aquario = new Aquario(10, 5, 3);
        aquario.setLargura(4);
        double largura = aquario.getLargura();
        Assertions.assertEquals(4, largura);

        // Testando valor inválido
        aquario.setLargura(-2);
        largura = aquario.getLargura();
        Assertions.assertEquals(4, largura); // A largura não deve ter sido alterada
    }

    @Test
    public void testGetSetComprimento() {
        Aquario aquario = new Aquario(10, 5, 3);
        aquario.setComprimento(12);
        double comprimento = aquario.getComprimento();
        Assertions.assertEquals(12, comprimento);

        // Testando valor inválido
        aquario.setComprimento(0);
        comprimento = aquario.getComprimento();
        Assertions.assertEquals(12, comprimento); // O comprimento não deve ter sido alterado
    }

    @Test
    public void testGetSetAltura() {
        Aquario aquario = new Aquario(10, 5, 3);
        aquario.setAltura(6);
        double altura = aquario.getAltura();
        Assertions.assertEquals(6, altura);

        // Testando valor inválido
        aquario.setAltura(-3);
        altura = aquario.getAltura();
        Assertions.assertEquals(6, altura); // A altura não deve ter sido alterada
    }
}
