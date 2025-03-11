package SOLID.exerciciofinal;

// Classe para processar pedidos (SRP: Processamento separado do Pedido)
public class ProcessarPedidoPadrao implements ProcessarPedido{
    private Notificacao notificacao;

    public ProcessarPedidoPadrao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public void processar(Pedido pedido) {
        System.out.println("Salvando pedido " + pedido.getProduto());
        notificacao.enviar("Pedido de "+ pedido.getProduto() + " no valor de " + pedido.calcularPrecoFinal());
    }
}
