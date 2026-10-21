package API.polimorfismo;

public class Humano extends SerVivo {
    public Humano() {
        super(19); //chamando o construtor da classe abstrata
    }

    @Override
    public void respirar() {
        System.out.println("Humano respirando");
    }
}
