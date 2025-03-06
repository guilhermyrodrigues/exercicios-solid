package SOLID.OCP.ex01;

public class CalculoSalarioEstagiario implements CalculoSalario{
    @Override
    public double calcular(double salario) {
        return salario * 0.8;
    }
}
