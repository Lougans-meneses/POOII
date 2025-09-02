package Desafio;

public class EnvioTransportadora implements MetodoEnvio {
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido " + pedido.getId() + " enviado por Transportadora.");
    }
}
