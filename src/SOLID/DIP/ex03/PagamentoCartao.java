package SOLID.DIP.ex03;

public class PagamentoCartao implements Pagamento{
    @Override
    public void executar(double valor) {
        System.out.println("Pagamento de R$" + valor + " via cartão.");
    }
}
