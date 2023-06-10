package semana12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BanqueiroTest {

    @Test
    public void testSacarSaldoSuficiente() {
        int codigo = 123;
        String correntista = "Vinicius Junor";
        double saldoInicial = 1000.0;
        double valorSaque = 500.0;
        double saldoEsperado = saldoInicial - valorSaque;

        Banqueiro banqueiro = new Banqueiro(codigo, correntista);
        banqueiro.depositar(saldoInicial);
        banqueiro.sacar(valorSaque);

        assertEquals(saldoEsperado, banqueiro.getSaldo());
    }

    @Test
    public void testSacarSaldoInsuficiente() {
        int codigo = 123;
        String correntista = "Vinicius Junor";
        double saldoInicial = 1000.0;
        double valorSaque = 1500.0;
        double saldoEsperado = saldoInicial;

        Banqueiro banqueiro = new Banqueiro(codigo, correntista);
        banqueiro.depositar(saldoInicial);
        banqueiro.sacar(valorSaque);

        assertEquals(saldoEsperado, banqueiro.getSaldo());
    }

    @Test
    public void testDepositarValorPositivo() {
        int codigo = 123;
        String correntista = "Vinicius Junor";
        double saldoInicial = 1000.0;
        double valorDeposito = 500.0;
        double saldoEsperado = saldoInicial + valorDeposito;

        Banqueiro banqueiro = new Banqueiro(codigo, correntista);
        banqueiro.depositar(saldoInicial);
        banqueiro.depositar(valorDeposito);

        assertEquals(saldoEsperado, banqueiro.getSaldo());
    }

    @Test
    public void testDepositarValorNegativo() {
        int codigo = 123;
        String correntista = "Vinicius Junor";
        double saldoInicial = 1000.0;
        double valorDeposito = -500.0;
        double saldoEsperado = saldoInicial;

        Banqueiro banqueiro = new Banqueiro(codigo, correntista);
        banqueiro.depositar(saldoInicial);
        banqueiro.depositar(valorDeposito);

        assertEquals(saldoEsperado, banqueiro.getSaldo());
    }

    /**
     * 
     */
    @Test
    public void testTransferirSaldoSuficiente() {
        int codigo1 = 123;
        String correntista1 = "Vinicius Junor";
        double saldoInicial1 = 1000.0;
        int codigo2 = 456;
        String correntista2 = "Rodinei Campos";
        double saldoInicial2 = 500.0;
        double valorTransferencia = 500.0;
        Banqueiro banqueiro1 = new Banqueiro(codigo1, correntista1);
        banqueiro1.depositar(saldoInicial1);
        Banqueiro banqueiro2 = new Banqueiro(codigo2, correntista2);
        banqueiro2.depositar(saldoInicial2);
        banqueiro1.transferir(valorTransferencia, banqueiro2);
    }
}