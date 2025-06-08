package builder;

public class CarroEsportivoBuilder implements CarroBuilder {

    Carro carro = new Carro();

    @Override
    public void construirMotor() {
        carro.setMotor(" v6");
    }

    @Override
    public void construirPortas() {
         carro.setPortas(2);
    }

    @Override
    public Carro getCarro() {
        return carro;
    }
}