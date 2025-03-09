package SOLID.SRP.ex03;

public class FormatarMensagem {
    public String formatarMensagem(Notificacao notificacao) {
        return "[NOTIFICAÇÃO] " + notificacao.getMensagem();
    }
}
