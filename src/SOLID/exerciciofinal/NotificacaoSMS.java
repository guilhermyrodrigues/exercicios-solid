package SOLID.exerciciofinal;

// Implementações de Notificacao
public class NotificacaoSMS implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS " + mensagem);
    }
}
