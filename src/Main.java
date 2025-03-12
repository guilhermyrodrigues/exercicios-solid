import SOLID.DIP.ex01.Interruptor;
import SOLID.DIP.ex01.LampadaIncandescente;
import SOLID.DIP.ex02.ArquivoTexto;
import SOLID.DIP.ex02.Leitor;
import SOLID.DIP.ex03.Caixa;
import SOLID.DIP.ex03.PagamentoCartao;
import SOLID.ISP.ex01.MaquinaManual;
import SOLID.ISP.ex01.MaquinaModerna;
import SOLID.ISP.ex02.Radio;
import SOLID.ISP.ex02.Smartphone;
import SOLID.ISP.ex03.Borracha;
import SOLID.ISP.ex03.Caneta;
import SOLID.LSP.ex01.Animal;
import SOLID.LSP.ex01.Pinguim;
import SOLID.LSP.ex02.ContaCorrente;
import SOLID.LSP.ex02.ContaSomenteDeposito;
import SOLID.LSP.ex03.Impressora;
import SOLID.LSP.ex03.ImpressoraBasica;
import SOLID.LSP.ex03.ImpressoraModerna;
import SOLID.OCP.ex01.CalculadoraDeSalario;
import SOLID.OCP.ex01.CalculoSalarioEstagiario;
import SOLID.OCP.ex02.FormatadorTexto;
import SOLID.OCP.ex02.MaiusculaFormatador;
import SOLID.OCP.ex02.NegritorFormatador;
import SOLID.OCP.ex03.CalculadoraFrete;
import SOLID.OCP.ex03.FreteExpresso;
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

        CalculoSalarioEstagiario calculoSalarioEstagiario = new CalculoSalarioEstagiario();

        CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();

        System.out.println(calculadoraDeSalario.calcular(2500, calculoSalarioEstagiario));


        // EX02
        System.out.println("EX 02 OCP");

        NegritorFormatador negritorFormatador = new NegritorFormatador();

        MaiusculaFormatador maiusculaFormatador = new MaiusculaFormatador();

        FormatadorTexto formatadorTexto = new FormatadorTexto();

        System.out.println(formatadorTexto.formatar("Teste", negritorFormatador));
        System.out.println(formatadorTexto.formatar("ola", maiusculaFormatador));



        // EX03
        System.out.println("EX 03 OCP");

        FreteExpresso freteExpresso = new FreteExpresso();

        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();

        System.out.println(calculadoraFrete.calcular(50.0, freteExpresso));

        // Exercicios LSP
        System.out.println("Exercicios LSP");

        // EX01
        System.out.println("EX 01 LSP");

        Animal animal = new Animal();
        animal.mover();
        Pinguim pinguim = new Pinguim();
        pinguim.mover();

        // EX02
        System.out.println("EX 02 LSP");

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.sacar(500.0);

        ContaSomenteDeposito contaSomenteDeposito = new ContaSomenteDeposito();

        contaSomenteDeposito.depositar(1200.0);


        // EX03
        System.out.println("EX 03 LSP");

        ImpressoraModerna impressoraModerna = new ImpressoraModerna();
        ImpressoraBasica impressoraBasica = new ImpressoraBasica();

        impressoraModerna.imprimir("Teste");
        impressoraBasica.imprimir("Teste");

        // Exercicios ISP
        System.out.println("Exercicios ISP");
        // EX01
        System.out.println("EX 01 ISP");

        MaquinaModerna maquinaModerna = new MaquinaModerna();
        MaquinaManual maquinaManual = new MaquinaManual();

        maquinaModerna.ligar();
        maquinaModerna.processarMaterial();

        maquinaManual.ligar();

        // maquinaManual.processarMaterial();

        // EX02
        System.out.println("EX 02 ISP");

        Radio radio = new Radio();
        Smartphone smartphone = new Smartphone();

        radio.ligar();

        smartphone.conectarInternet();
        smartphone.ligar();


        // EX03
        System.out.println("EX 03 ISP");

        Borracha borracha = new Borracha();
        Caneta caneta = new Caneta();

        borracha.apagar();
        caneta.escrever();

        // Exercicios DIP
        System.out.println("Exercicios DIP");

        // EX01
        System.out.println("EX 01 DIP");

        LampadaIncandescente lampadaIncandescente = new LampadaIncandescente();
        Interruptor interruptor = new Interruptor(lampadaIncandescente);

        interruptor.acionar();

        // EX02
        System.out.println("EX 02 DIP");

        ArquivoTexto arquivoTexto = new ArquivoTexto();

        Leitor leitor = new Leitor(arquivoTexto);

        leitor.ler();

        // EX03
        System.out.println("EX 03 DIP");

        PagamentoCartao pagamentoCartao = new PagamentoCartao();
        Caixa caixa = new Caixa(pagamentoCartao);

        caixa.processar(5500.0);

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