public class Carro extends Veiculo {

   

    public Carro(String marca, int ano){
        super(marca, ano);

    }

    @Override
    public void dados() {
       System.out.println("marca: " + marca);
       System.err.println("ano: " + ano);
    }



}
