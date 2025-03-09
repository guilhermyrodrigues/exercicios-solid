package SOLID.ISP.ex01;

public class MaquinaModerna implements Ligavel, Processante{
    @Override
    public void ligar() {
        System.out.println("Máquina ligada.");
    }

    @Override
    public void processarMaterial() {
        System.out.println("Material Processado.");
    }
}
