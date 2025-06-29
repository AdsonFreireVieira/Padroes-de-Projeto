package Principal;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new AdapterPaypal( new PayPalApi());

        pagamento.Pagar(150);
    }
}
