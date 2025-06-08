package builder;

public class main {
    public static void main(String[] args) {

        CarroBuilder builder  = new CarroEsportivoBuilder();

        Director director =   new Director(builder);

        director.construirCarro();

        Carro carro = director.getCarro();
        System.out.println(carro);

    }
}
