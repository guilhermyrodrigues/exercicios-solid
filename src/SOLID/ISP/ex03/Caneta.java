package SOLID.ISP.ex03;

public class Caneta implements Escrevivel{

    @Override
    public void escrever() {
        System.out.println("Escrevendo com a caneta.");
    }
}
