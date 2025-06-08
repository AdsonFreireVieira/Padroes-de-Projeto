package builder;

public class Director {

    private CarroBuilder builder;

     public Director(CarroBuilder builder){

         this.builder =builder;
     }

     public void construirCarro(){

         builder.construirMotor();
         builder.construirPortas();

     }

     public Carro getCarro(){
         return  builder.getCarro();
     }
    }
