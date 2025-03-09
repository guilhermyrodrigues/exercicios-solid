package SOLID.OCP.ex03;

public class FreteNormal implements Calculadora{
    @Override
    public double calcular(double peso) {
        return peso * 5.0;
    }
}
