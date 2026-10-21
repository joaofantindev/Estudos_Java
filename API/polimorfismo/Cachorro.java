package API.polimorfismo;

public class Cachorro extends SerVivo {
    public Cachorro() {
        super(5); //chamando o construtor da classe abstrata
    }

    @Override
    public void respirar() {
        System.out.println("Cachorro respirando");
    }

}
