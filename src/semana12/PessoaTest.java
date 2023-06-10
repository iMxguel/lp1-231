package semana12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    public void testConstrutorPessoa() {
        double altura = 1.75;
        double peso = 70.0;

        Pessoa pessoa = new Pessoa(altura, peso);

        assertEquals(altura, pessoa.altura);
        assertEquals(peso, pessoa.peso);
    }

    
}
