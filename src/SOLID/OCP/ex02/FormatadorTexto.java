package SOLID.OCP.ex02;

public class FormatadorTexto{
    public String formatar(String texto, Formatador formatador) {
        return formatador.formatar(texto);
    }
}
