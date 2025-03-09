package SOLID.LSP.ex02;

public class ContaSomenteDeposito implements Conta{
    @Override
    public void depositar(double valor) {
        System.out.println("Depositando R$" + valor);
    }
}
