package singletonPrincipal;

public class Main {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();

        s.exibirMensagem();
    }
}
