package MonoState;

public class Main {

    public static void main(String[] args) {

        /*
        * padrao monostate dois objetos criados que compartilha mesmo valor*/
        MonoState m1 = new MonoState();
        MonoState m2 = new MonoState();

        m1.setValor(35);

        System.out.println(m2.getValor());    }
}
