package semana11;

import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {
    @Test
    public void testCalcularImc() {
        double altura = 2.00;
        double peso = 200;

        double imc = calcularImc(altura, peso);
        assertEquals(2.00, imc, 0.001);
    }

    private double calcularImc(double altura, double peso) {
        return peso / (altura * altura);
    }
}
