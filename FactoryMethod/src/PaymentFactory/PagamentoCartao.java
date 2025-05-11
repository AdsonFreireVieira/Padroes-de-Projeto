package PaymentFactory;

public class PagamentoCartao implements Pagamento {
    @Override
    public void processar(double valor) {
        System.out.println( "Processamento cartao" + valor);
    }
}
