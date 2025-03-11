package SOLID.SRP.ex03;

public class FormatarMensagem {
    public String formatarMensagem(NotificacaoMensagem notificacao) {
        return "[NOTIFICAÇÃO] " + notificacao.getMensagem();
    }
}
