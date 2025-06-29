package Principal;

public class AdapterPaypal implements  Pagamento{

    private PayPalApi payPalApi;

    public AdapterPaypal(PayPalApi payPalApi) {
        this.payPalApi = payPalApi;
    }

    @Override
    public void Pagar(double valor) {
 payPalApi.realizarPagamentoComPayPal(valor);
    }
}
