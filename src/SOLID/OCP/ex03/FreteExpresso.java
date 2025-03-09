package SOLID.OCP.ex03;

public class FreteExpresso implements Calculadora{

    @Override
    public double calcular(double peso) {
        return peso * 10.0;
    }
}
