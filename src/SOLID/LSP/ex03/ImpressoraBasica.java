package SOLID.LSP.ex03;

public class ImpressoraBasica implements Impressora{
    @Override
    public void imprimir(String texto) {
        throw new UnsupportedOperationException("Esta impressora não suporta impressão.");
    }
}
