package semana12;

public class Banqueiro {
    private int codigo;
    private double saldo;
    private String correntista;
    public Object transferir;

    public Banqueiro(int codigo, String correntista) {
        this.codigo = codigo;
        this.correntista = correntista;
        this.saldo = 0.0;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso, novo saldo disponvel: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque :( ).");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso, novo saldo disponivel: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void transferir(double valor, Banqueiro destino) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
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

