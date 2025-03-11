package SOLID.exerciciofinal;

// Implementações de desconto
public class DescontoEstudante implements Desconto{
    @Override
    public double aplicar(double preco) {
        return preco * 0.9;
    }
}
