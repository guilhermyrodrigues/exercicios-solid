package SOLID.ISP.ex02;

public class Smartphone implements DispositivoConectavel{
    @Override
    public void conectarInternet() {
        System.out.println("Smartphone conectado a internet com sucesso.");
    }

    @Override
    public void ligar() {
        System.out.println("Smartphone ligado com sucesso.");
    }
}
