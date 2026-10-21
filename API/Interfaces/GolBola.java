package API.Interfaces;

public class GolBola implements Carro {
    @Override
    public void ligar() {
        System.out.println("Gol Bola ligado");
    }

    @Override //sobrescreve o metodo
    public void desligar() {
        System.out.println("Gol Bola desligado");
    }

    @Override
    public void andar() {
        System.out.println("Gol Bola andando");
    }
    
}
