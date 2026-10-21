package API.Interfaces;

public class Fusca implements Carro {
    @Override
    public void ligar() {
        System.out.println("Fusca ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Fusca desligado");
    }

    @Override
    public void andar() {
        System.out.println("Fusca andando");
    }

}
