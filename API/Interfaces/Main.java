package API.Interfaces;

public class Main {
    public static void main(String[] args) {
        Carro golbola = new GolBola(); //instanciamos a classe, nao a interface
        golbola.ligar();
        Carro fusca = new Fusca();
        fusca.ligar();
    };

}
 
