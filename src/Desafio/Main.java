package Desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Notificacao> meioDeComunicacao = new ArrayList<>();

        System.out.println("Escolha os meios de notificações ");
        System.out.println("1 - E-mail");
        System.out.println("2 - SMS");
        System.out.println("3 - Push Notificação");

        String[] opcoes = input.nextLine().split(" ");

        for (String opcao : opcoes) {
            switch (opcao) {
                case "1" -> meioDeComunicacao.add(new EmailNotificacao());
                case "2" -> meioDeComunicacao.add(new SmsNotificacao());
                case "3" -> meioDeComunicacao.add(new PushNotificacao());
            }
        }

        if (meioDeComunicacao.isEmpty()) {
            System.out.println("Selecione algumas das opções");
        } else {
            GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(meioDeComunicacao);

            System.out.println("Digite a mensagem ?");
            String mensagem = input.nextLine();

            gerenciador.notificarTodos(mensagem);
        }
    }
}
