import SOLID.SRP.ex01.Estudante;
import SOLID.SRP.ex01.ExibidorEstudante;
import SOLID.SRP.ex02.CalculaImposto;
import SOLID.SRP.ex02.GerarRecibo;
import SOLID.SRP.ex02.Venda;
import SOLID.SRP.ex03.EnviarNotificacao;
import SOLID.SRP.ex03.FormatarMensagem;
import SOLID.SRP.ex03.NotificacaoMensagem;
import SOLID.exerciciofinal.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Exercicios SRP

        // EX01
        System.out.println("Exercicios SRP");
        System.out.println("EX 01 SRP");
        Estudante estudante = new Estudante("Carlos", 20);
        ExibidorEstudante exibidorEstudante = new ExibidorEstudante();

        exibidorEstudante.exibir(estudante);

        // EX02

        System.out.println("EX 02 SRP");

        Venda venda = new Venda(500.0, "CPU Intel");

        System.out.println(venda);

        CalculaImposto calculaImposto = new CalculaImposto();

        calculaImposto.calcularTotalComImposto(venda);

        System.out.println(venda);

        GerarRecibo gerarRecibo = new GerarRecibo();

        gerarRecibo.gerarRecibo(venda);

        // EX03

        System.out.println("EX 03 SRP");

        NotificacaoMensagem notificacaoMensagem = new NotificacaoMensagem("Teste Mensagem");

        FormatarMensagem formatarMensagem = new FormatarMensagem();

        System.out.println(formatarMensagem.formatarMensagem(notificacaoMensagem));

        EnviarNotificacao enviarNotificacao = new EnviarNotificacao();

        enviarNotificacao.enviarNotificacao(notificacaoMensagem);

        // Exercicios OCP
        System.out.println("Exercicios OCP");

        // EX01
        System.out.println("EX 01 OCP");
        // EX02

        System.out.println("EX 02 OCP");
        // EX03
        System.out.println("EX 03 OCP");
        // Exercicios LSP
        System.out.println("Exercicios LSP");

        // EX01
        System.out.println("EX 01 LSP");

        // EX02
        System.out.println("EX 02 LSP");

        // EX03
        System.out.println("EX 03 LSP");

        // Exercicios ISP
        System.out.println("Exercicios ISP");
        // EX01
        System.out.println("EX 01 ISP");
        // EX02
        System.out.println("EX 02 ISP");
        // EX03
        System.out.println("EX 03 ISP");
        // Exercicios DIP
        System.out.println("Exercicios DIP");

        // EX01
        System.out.println("EX 01 DIP");
        // EX02
        System.out.println("EX 02 DIP");
        // EX03
        System.out.println("EX 03 DIP");
        // Projeto Final

        Desconto desconto = new DescontoEstudante();
        Pedido pedido = new Pedido("Laptop", 2000.50, desconto);

        Notificacao notificacao = new NotificacaoEmail();
        ProcessarPedido processador = new ProcessarPedidoPadrao(notificacao);

        processador.processar(pedido);

        ExibicaoPedido exibicao = new ExibicaoConsole();
        exibicao.exibir(pedido);
    }
}