package SOLID.OCP.ex01;

public class CalculoSalarioGerente implements CalculoSalario{


    public double calcular(double salario) {
        return salario * 1.2;
    }
}
