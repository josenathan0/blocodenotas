package bloco;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Anotacao {
    private static int contadorId = 0;

    private String texto;
    private int id;
    private boolean remover;
    private LocalDate data;

    Scanner sc = new Scanner(System.in);

    public Anotacao(String textosDigitados) {
        texto = textosDigitados;
        remover = false;
        data = LocalDate.now();
        id = contadorId++;
    }

    public void editar() {
        System.out.println("Digite o texto a ser editado: ");
        texto = sc.nextLine();
    }

    public void remover() {
        remover = true;
    }

    public LocalDate getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isRemover() {
        return remover;
    }

    @Override
    public String toString() {
        return "Anotacao{" +
                "texto='" + texto + '\'' +
                ", id=" + id +
                ", remover=" + remover +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anotacao anotacao = (Anotacao) o;
        return id == anotacao.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}