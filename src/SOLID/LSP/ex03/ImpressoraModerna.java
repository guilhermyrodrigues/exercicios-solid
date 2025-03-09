package SOLID.LSP.ex03;

public class ImpressoraModerna implements Impressora{
    @Override
    public void imprimir(String texto) {
        System.out.println("Imprimindo: " + texto);
    }
}
