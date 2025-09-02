

public class PedidoService {
    private MetodoPagamento metodoPagamento;
    private MetodoEnvio metodoEnvio;

    public PedidoService(MetodoPagamento metodoPagamento, MetodoEnvio metodoEnvio) {
        this.metodoPagamento = metodoPagamento;
        this.metodoEnvio = metodoEnvio;
    }

    public void processarPedido(Pedido pedido) {
        System.out.println("Processando " + pedido);
        metodoPagamento.pagar(pedido.getValorTotal());
        metodoEnvio.enviar(pedido);
    }
}
