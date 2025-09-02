package Desafio;

public class PagamentoPayPal implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PayPal.");
    }
}
