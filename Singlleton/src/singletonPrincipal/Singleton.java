package singletonPrincipal;

public class Singleton {

    private static  final Singleton instance = new Singleton();


    private  Singleton(){}

    public static Singleton getInstance(){

        return instance;
    }

    public void exibirMensagem(){
        System.out.print("Exemplo GPt de Singleton");
    }
}
