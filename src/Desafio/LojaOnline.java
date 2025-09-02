package Desafio;

public class LojaOnline {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("001");
        pedido1.adicionarItem("PC Gamer", 5500.00);
        pedido1.adicionarItem("Cadeira Gamer", 2500.00);

        PedidoService service1 = new PedidoService(new PagamentoCartao(), new EnvioCorreios());
        service1.processarPedido(pedido1);

        System.out.println("--------------");

        Pedido pedido2 = new Pedido("002");
        pedido2.adicionarItem("Playstation 5", 6500.00);

        PedidoService service2 = new PedidoService(new PagamentoPix(), new EnvioTransportadora());
        service2.processarPedido(pedido2);
    }
}
