

import org.junit.Test;
import static org.junit.Assert.*;

public class AquarioTest {
    @Test
    public void testCalcularVolume() {
        double comprimento = 50.0;
        double altura = 40.0;
        double largura = 30.0;

        double volume = calcularVolume(comprimento, altura, largura);
        assertEquals(60.0, volume, 0.001);

        comprimento = 100.0;
        altura = 60.0;
        largura = 80.0;

        volume = calcularVolume(comprimento, altura, largura);
        assertEquals(480.0, volume, 0.001);
    }

    private double calcularVolume(double comprimento, double altura, double largura) {
        return 0;
    }
}
