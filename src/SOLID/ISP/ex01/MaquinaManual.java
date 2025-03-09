package SOLID.ISP.ex01;

public class MaquinaManual implements Ligavel{
    @Override
    public void ligar() {
        System.out.println("Maquina Ligada.");
    }
}
