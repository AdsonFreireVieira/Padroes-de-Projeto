package Principal;

public class PopularFactory implements CarroFactory {



    @Override
    public Motor CriarMotor() {
        return new MotorPopular();
    }

    @Override
    public Roda CriarRoda() {
        return new RodaPopular();
    }
}
