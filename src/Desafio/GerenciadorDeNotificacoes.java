package Desafio;

import java.util.List;

public class GerenciadorDeNotificacoes {
    private List<Notificacao> notificacoes;

    public GerenciadorDeNotificacoes(List<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }

    public void notificarTodos(String mensagem) {
        for(Notificacao notificacao : notificacoes) {
            notificacao.enviar(mensagem);
        }
    }
}
