package SOLID.ISP.ex02;

public class Radio implements Dispositivo{
    @Override
    public void ligar() {
        System.out.println("Radio ligado.");
    }
}
