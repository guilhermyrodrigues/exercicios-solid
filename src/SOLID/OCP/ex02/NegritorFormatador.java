package SOLID.OCP.ex02;

public class NegritorFormatador implements Formatador{
    @Override
    public String formatar(String texto) {
        return "<b>" + texto + "</b>";
    }
}
