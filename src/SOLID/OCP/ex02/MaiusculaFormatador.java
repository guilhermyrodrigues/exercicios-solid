package SOLID.OCP.ex02;

public class MaiusculaFormatador implements Formatador{
    @Override
    public String formatar(String texto) {
        return texto.toUpperCase();
    }
}
