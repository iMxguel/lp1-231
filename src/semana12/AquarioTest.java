package semana12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AquarioTest {

    @Test
    public void testConstrutorAquarioComValoresSeparados() {
        double comprimento = 50.0;
        double altura = 30.0;
        double largura = 20.0;

        Aquario aquario = new Aquario(comprimento, altura, largura);

        assertEquals(comprimento, aquario.getComprimento());
        assertEquals(altura, aquario.getAltura());
        assertEquals(largura, aquario.getLargura());
    }

    @Test
    public void testConstrutorAquarioComValorUnico() {
        double valorUnico = 40.0;

        Aquario aquario = new Aquario(valorUnico);

        assertEquals(valorUnico, aquario.getComprimento());
        assertEquals(valorUnico, aquario.getAltura());
        assertEquals(valorUnico, aquario.getLargura());
    }

   
}
