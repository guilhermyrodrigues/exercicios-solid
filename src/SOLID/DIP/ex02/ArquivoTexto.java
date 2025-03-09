package SOLID.DIP.ex02;

public class ArquivoTexto implements Arquivo{
    @Override
    public void abrir() {
        System.out.println("Abrindo arquivo texto...");
    }
}
