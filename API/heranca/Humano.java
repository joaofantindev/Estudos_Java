package API.heranca;

public class Humano extends SerVivo { // a classe humano herda tudo de servivo
    public Humano() {
        super(19); //chamando o construtor da classe abstrata
    }

    @Override
    public void respirar() {
        System.out.println("Respirando");
    }

    @Override
    public void dormir() {
        System.out.println("Dormindo");
    }
    //entao a gente sobrescreve aqui dentro da classe o metodo abstrato
}
