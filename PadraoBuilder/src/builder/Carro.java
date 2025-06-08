package builder;

public class Carro {

    private String motor;

    private int portas;

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {

        return "Carro com motor" + motor + "  e  "+ portas + "  portas";
    }
}
