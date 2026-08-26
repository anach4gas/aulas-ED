package revisao;

import java.sql.SQLOutput;

public class Projeto_Revisao {
    public static void main(String[] args) throws Exception{
        Vetor vetor = new Vetor(5);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 4");
        vetor.adiciona("Elemento 5");
        vetor.adiciona("Elemento 6");
        vetor.adiciona("Elemento 7");
        vetor.adiciona("Elemento 8");

        System.out.println("Quantidade de dados no vetor: " + vetor.tamanho());
        System.out.println("Dados do vetor: " + vetor.toString());

        System.out.println("Dado na primeira posicao: " + vetor.busca(1));
        System.out.println("posicao da informaçao: " + vetor.busca1("Elemento 4"));

    }
}

