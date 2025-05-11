package PaymentFactory;

public class PagamentoPix implements Pagamento {


    @Override
    public void processar(double valor) {
        System.out.println("PAgamento Por Pix"+ valor);
    }
}
