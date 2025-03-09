package SOLID.DIP.ex02;

public class Leitor {
    private ArquivoTexto arquivoTexto;

    public Leitor(ArquivoTexto arquivoTexto) {
        this.arquivoTexto = arquivoTexto;
    }

    public void ler() {
        arquivoTexto.abrir();
    }
}
