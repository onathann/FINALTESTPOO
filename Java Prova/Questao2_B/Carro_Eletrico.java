public class Carro_Eletrico extends Veiculo implements Eletrico, Conduzivel {


    @Override
    public void conduzindo() {
        System.out.println("Este carro está pronto para condução");
    }
    @Override
    public void carro_eletrico() {
        
        System.out.println("este carro é eletrico");
    }



}
