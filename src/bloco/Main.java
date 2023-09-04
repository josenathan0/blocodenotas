package bloco;

import java.util.Scanner;

public class Main {
    static final int ADICIONAR_ANOTACAO = 1;
    static final int BUSCAR_ANOTACAO = 2;
    static final int EDITAR_ANOTACAO = 3;
    static final int APAGAR_ANOTACAO = 4;
    static final int VISUALIZAR_ANOTACAO = 5;
    static final int SAIR = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

        boolean sairUsu = false;
        do {
            System.out.println("""
                    Digite:
                    |1-Adicionar Anotação
                    |2-Buscar Anotação
                    |3-Editar Anotação
                    |4-Apagar Anotação
                    |5-Visualizar Anotações
                    |6-Sair
                    """);

            int entradaUsuario = sc.nextInt();
            sc.nextLine();

            switch (entradaUsuario) {
                case ADICIONAR_ANOTACAO:
                    System.out.println("Você escolheu adicionar anotação! ");
                    System.out.println("Digite o texto:");
                    String texto = sc.nextLine();
                    Anotacao anotacaoAdicionar = new Anotacao(texto);
                    blocoDeNotas.adicionarAnotacao(anotacaoAdicionar);
                    break;

                case BUSCAR_ANOTACAO:
                    System.out.println("Você escolheu buscar anotação! ");
                    System.out.println("Digite a anotação que deseja buscar: ");
                    String textoASerBuscado = sc.nextLine();
                    blocoDeNotas.procurarPorTexto(textoASerBuscado);
                    break;

                case EDITAR_ANOTACAO:
                    System.out.println("Você escolheu editar a anotação! ");
                    blocoDeNotas.visualizarAnotacoes();
                    System.out.println("Digite o número da anotação que você quer editar: ");
                    int numAnotASerEditado = sc.nextInt();
                    sc.nextLine();
                    blocoDeNotas.editar(numAnotASerEditado);
                    break;

                case APAGAR_ANOTACAO:
                    System.out.println("Você escolheu apagar anotação!");
                    blocoDeNotas.visualizarAnotacoes();
                    System.out.println("Digite o número da anotação que você quer apagar: ");
                    int numAnotASerApagado = sc.nextInt();
                    sc.nextLine();
                    blocoDeNotas.excluir(numAnotASerApagado);
                    break;

                case VISUALIZAR_ANOTACAO:
                    System.out.println("Você escolheu ver as anotações: ");
                    blocoDeNotas.visualizarAnotacoes();
                    break;

                case SAIR:
                    System.out.println("Tchau! Até a próxima!");
                    sairUsu = true;
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (!sairUsu);
    }
}