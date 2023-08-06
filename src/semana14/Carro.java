package semana14;

public class Carro {
    private final String modelo;
    private final int ano;

    public Carro(String modelo, int ano) throws AnoInvalidoException {
        if (ano < 1885) {
            throw new AnoInvalidoException("Ano inválido. O ano deve ser maior ou igual a 1885.");
        }
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}

class AnoInvalidoException extends Exception {
    public AnoInvalidoException(String mensagem) {
        super(mensagem);
    }
}

