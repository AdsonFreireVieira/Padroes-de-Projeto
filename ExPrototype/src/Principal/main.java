package Principal;

public class main {

    public static void main(String[] args) {
        Documento notaFiscalModelo = new Documento("Nota Fiscal Padrão", "Cliente: ____, Valor: ____");

        Documento notaFiscal1 = (Documento) notaFiscalModelo.clonar();
        notaFiscal1.setConteudo("Cliente: João, Valor: R$ 500");

        Documento notaFiscal2 = (Documento) notaFiscalModelo.clonar();
        notaFiscal2.setConteudo("Cliente: Maria, Valor: R$ 750");

        System.out.println(notaFiscal1);
        System.out.println(notaFiscal2);


}

}