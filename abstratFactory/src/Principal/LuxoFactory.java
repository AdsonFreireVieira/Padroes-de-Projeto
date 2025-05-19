package Principal;

public class LuxoFactory implements CarroFactory{
    @Override
    public Motor CriarMotor() {
        return new MotorLuxo();   }

    @Override
    public Roda CriarRoda() {
        return new RodaLuxo();
    }
}
