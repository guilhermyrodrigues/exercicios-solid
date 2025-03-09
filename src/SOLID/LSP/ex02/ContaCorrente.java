package SOLID.LSP.ex02;

public class ContaCorrente implements ContaComSaque{
    @Override
    public void sacar(double valor) {
        System.out.println("Sacando R$" + valor);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando R$" + valor);
    }
}
