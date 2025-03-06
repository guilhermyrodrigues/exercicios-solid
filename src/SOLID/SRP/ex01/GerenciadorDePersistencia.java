package SOLID.SRP.ex01;

public class GerenciadorDePersistencia {
    public void salvar(Estudante estudante) {
        System.out.println("Salvando " + estudante.getNome() + " no banco de dados...");
    }
}
