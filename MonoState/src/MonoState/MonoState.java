package MonoState;

public class MonoState {

    private static  int valorCompatilhado;


    public void setValor(int valor){
        valorCompatilhado = valor;
    };

    public int getValor(){
        return  valorCompatilhado;
    }
}
