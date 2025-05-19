package Principal;

public class Carro {

    private Motor motor;
    private Roda roda;

    public Carro(CarroFactory factory){
        motor = factory.CriarMotor();
        roda = factory.CriarRoda();

    }
    public void monta(){
        motor.ligar();
        roda.Girar();
    }
}
