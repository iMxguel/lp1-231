package semana17

public class Vendedor {
    private String nome;
    private double comissao;

    public Vendedor(String nome, double comissao) {
        this.nome = nome;
        this.comissao = comissao;
    }

    public double calcularSalario(double vendas) {
        return comissao * vendas;
    }
    
    // Getters e setters
}

// Classe VendedorFixo
class VendedorFixo extends Vendedor {
    private double salarioFixo;

    public VendedorFixo(String nome, double comissao, double salarioFixo) {
        super(nome, comissao);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularSalario(double vendas) {
        return super.calcularSalario(vendas) + salarioFixo;
    }
    
    // Getters e setters
}

// Classe Conta
class Conta {
    private String titular;
    protected double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    // Getters e setters
}

// Classe ContaCorrente
class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, double saldo, double limiteChequeEspecial) {
        super(titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    // Getters e setters
}

// Classe ContaPoupanca
class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
    }
    
    // Getters e setters
}

// Classe ContaSalario
class ContaSalario extends Conta {
    private int numeroDependentes;

    public ContaSalario(String titular, double saldo, int numeroDependentes) {
        super(titular, saldo);
        this.numeroDependentes = numeroDependentes;
    }

    @Override
    public void sacar(double valor) {
        double valorMinimo = 100 * numeroDependentes;
        if (valor <= saldo - valorMinimo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    // Getters e setters
}

public class Main {
    public static void main(String[] args) {
        // Exemplos de uso das classes
        Vendedor vendedor = new Vendedor("João", 0.1);
        System.out.println("Salário do vendedor: " + vendedor.calcularSalario(10000));

        VendedorFixo vendedorFixo = new VendedorFixo("Maria", 0.08, 2000);
        System.out.println("Salário do vendedor fixo: " + vendedorFixo.calcularSalario(8000));

        ContaCorrente contaCorrente = new ContaCorrente("Fulano", 5000, 1000);
        contaCorrente.depositar(2000);
        contaCorrente.sacar(7000);
        System.out.println("Saldo da conta corrente: " + contaCorrente.saldo);

        ContaPoupanca contaPoupanca = new ContaPoupanca("Ciclano", 10000, 0.05);
        contaPoupanca.aplicarRendimento();
        System.out.println("Saldo da conta poupança: " + contaPoupanca.saldo);

        ContaSalario contaSalario = new ContaSalario("Beltrano", 3000, 2);
        contaSalario.sacar(500);
        System.out.println("Saldo da conta salário: " + contaSalario.saldo);
    }
}
