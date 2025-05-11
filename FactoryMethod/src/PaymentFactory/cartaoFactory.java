package PaymentFactory;

public class cartaoFactory extends  PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCartao();
    }
}
