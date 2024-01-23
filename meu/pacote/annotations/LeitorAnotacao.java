package meu.pacote.annotations;

import meu.pacote.modelo.MinhaClasse;

public class LeitorAnotacao {

    public static void main(String[] args) {
        lerAnotacaoDaClasse(MinhaClasse.class);
        // Adicione outras chamadas para lerAnotacaoDaClasse para outras classes, se
        // necessário
    }

    private static void lerAnotacaoDaClasse(Class<?> classe) {
        // Verificar se a anotação Tabela está presente
        if (classe.isAnnotationPresent(Tabela.class)) {
            // Obter a instância da anotação Tabela
            Tabela anotacaoTabela = classe.getAnnotation(Tabela.class);

            // Imprimir o nome da tabela
            String nomeDaTabela = anotacaoTabela.nome();
            System.out.println("Nome da tabela para " + classe.getSimpleName() + ": " + nomeDaTabela);
        } else {
            System.out.println("A anotação Tabela não está presente em " + classe.getSimpleName());
        }
    }
}