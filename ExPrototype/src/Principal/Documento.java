package Principal;

public class Documento implements DocumentoPrototype {
    private String titulo;
    private String conteudo;

    public Documento(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public DocumentoPrototype clonar() {
        return new Documento(this.titulo, this.conteudo);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}