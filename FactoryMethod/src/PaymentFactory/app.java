package PaymentFactory;

public class app {

    public static  void realizarCompra(PagamentoFactory pagamentoFactory , double valor){
        Pagamento pagamento = pagamentoFactory.criarPagamento();
        pagamento.processar(valor);
    }
    public static void main (String [] args){

        realizarCompra(new cartaoFactory(),290);
        realizarCompra(new PixFactory() , 400);
    }
}
