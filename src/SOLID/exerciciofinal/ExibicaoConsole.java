package SOLID.exerciciofinal;

// Implementação de exibição no console
public class ExibicaoConsole implements ExibicaoPedido{
    @Override
    public void exibir(Pedido pedido) {
        System.out.println("Produto: " + pedido.getProduto() + ", Preço final " + pedido.calcularPrecoFinal());
    }
}
