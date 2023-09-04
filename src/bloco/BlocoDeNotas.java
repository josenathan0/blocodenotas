package bloco;

import java.util.ArrayList;

public class BlocoDeNotas {
    private ArrayList<Anotacao> anotacoes = new ArrayList<>();

    public void adicionarAnotacao(Anotacao anotacaoAdicionar) {
        anotacoes.add(anotacaoAdicionar);
    }

    public void editar(int id) {
        Anotacao anotacaoParaEditar = encontrarAnotacaoPorId(id);
        if (anotacaoParaEditar != null) {
            anotacaoParaEditar.editar();
            System.out.println("Anotação editada com sucesso!");
        } else {
            System.out.println("Anotação não encontrada.");
        }
    }


    public void visualizarAnotacoes() {
        for (Anotacao anotacao : anotacoes) {
            if (!anotacao.isRemover()) {
                System.out.println(anotacao.getId() + " " + anotacao.getTexto() + " " + anotacao.getData());
            }
        }
    }

    public void excluir(int id) {
        Anotacao anotacaoParaExcluir = encontrarAnotacaoPorId(id);
        if (anotacaoParaExcluir != null) {
            anotacaoParaExcluir.remover();
            System.out.println("Anotação excluída com sucesso!");
        } else {
            System.out.println("Anotação não encontrada.");
        }
    }


    public void procurarPorTexto(String palavraBuscada) {
        boolean encontrada = false;
        for (Anotacao anotacao : anotacoes) {
            if (anotacao.getTexto().contains(palavraBuscada) && !anotacao.isRemover()) {
                System.out.println(anotacao.getId() + " " + anotacao.getTexto() + " " + anotacao.getData());
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("Anotação não encontrada.");
        }
    }


    private Anotacao encontrarAnotacaoPorId(int id) {
        for (Anotacao anotacao : anotacoes) {
            if (anotacao.getId() == id) {
                return anotacao;
            }
        }
        return null;
    }
}