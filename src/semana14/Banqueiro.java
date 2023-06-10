package semana14;

public class Banqueiro {
    private final int codigo;
    private double saldo;
    private final String correntista;

    public Banqueiro(int codigo, String correntista) {
        if (codigo > 0) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("Código inválido. O código deve ser maior que zero.");
        }

        if (correntista.length() >= 5 && correntista.length() <= 100) {
            this.correntista = correntista;
        } else {
            throw new IllegalArgumentException("Nome do correntista inválido. O nome deve ter entre 5 e 100 caracteres.");
        }

        this.saldo = 0.0;
    }

    public void sacar(double valor) {
    }

    public void depositar(double valor) {
    }

    public void transferir(double valor, Banqueiro destino) {
    }

    public int getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCorrentista() {
        return correntista;
    }
}

