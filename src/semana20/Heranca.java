package semana20;

import java.util.ArrayList;
import java.util.List;

class Questao {
    private int numero;
    private String enunciado;
    private int pontuacao;

    public Questao(int numero, String enunciado) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.pontuacao = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return numero + ". " + enunciado;
    }
}

class QuestaoVF extends Questao {
    private boolean resposta;

    public QuestaoVF(int numero, String enunciado, boolean resposta) {
        super(numero, enunciado);
        this.resposta = resposta;
    }

    public boolean getResposta() {
        return resposta;
    }

    @Override
    public String toString() {
        return super.toString() + " (Verdadeiro/Falso)";
    }
}

class QuestaoEscolha extends Questao {
    private List<String> opcoes;

    public QuestaoEscolha(int numero, String enunciado, List<String> opcoes) {
        super(numero, enunciado);
        this.opcoes = opcoes;
    }

    public List<String> getOpcoes() {
        return opcoes;
    }

    @Override
    public String toString() {
        return super.toString() + " (Escolha)";
    }
}

class QuestaoMultiplaEscolha extends QuestaoEscolha {
    public QuestaoMultiplaEscolha(int numero, String enunciado, List<String> opcoes) {
        super(numero, enunciado, opcoes);
    }

    @Override
    public String toString() {
        return super.toString() + " (Multipla Escolha)";
    }
}

class Prova {
    private List<Questao> questoes;

    public Prova() {
        questoes = new ArrayList<>();
    }

    public void adicionarQuestao(Questao questao) {
        questoes.add(questao);
    }

    public int getPontuacaoTotal() {
        int pontuacaoTotal = 0;
        for (Questao questao : questoes) {
            pontuacaoTotal += questao.getPontuacao();
        }
        return pontuacaoTotal;
    }

    @Override
    public String toString() {
        StringBuilder provaString = new StringBuilder("Questoes da Prova:\n");
        for (Questao questao : questoes) {
            provaString.append(questao).append("\n");
        }
        provaString.append("Pontuacao Total: ").append(getPontuacaoTotal());
        return provaString.toString();
    }
}

public class Heranca {
    public static void main(String[] args) {
        QuestaoVF questaoVF = new QuestaoVF(1, "Java é uma linguagem de programação.", true);
        List<String> opcoes = new ArrayList<>();
        opcoes.add("A) Python");
        opcoes.add("B) C++");
        opcoes.add("C) Java");
        opcoes.add("D) JavaScript");
        QuestaoEscolha questaoEscolha = new QuestaoMultiplaEscolha(2, "Qual linguagem é usada na escola?", opcoes);

        Prova prova = new Prova();
        prova.adicionarQuestao(questaoVF);
        prova.adicionarQuestao(questaoEscolha);

        System.out.println(prova);
    }
}
