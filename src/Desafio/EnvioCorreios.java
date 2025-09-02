

public class EnvioCorreios implements MetodoEnvio {
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido " + pedido.getId() + " enviado pelos Correios.");
    }
}
