package SOLID.DIP.ex03;

public class Caixa {
    private PagamentoCartao pagamentoCartao;

    public Caixa(PagamentoCartao pagamentoCartao) {
        this.pagamentoCartao = pagamentoCartao;
    }

    public void processar(double valor) {
        pagamentoCartao.executar(valor);
    }
}
