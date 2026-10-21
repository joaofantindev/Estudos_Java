package src;
public class Caneta {
    public String name;
    public String color;
    private double price;
    protected int quantity;

    public Caneta(String name, String color, double price, int quantity) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }
    
    // construtor default (sem parametros)
    Caneta() {
        //this.name = "Caneta";
        //this.color = "Preta";
        //this.price = 1.0;
        //this.quantity = 10;
        this("Caneta", "Preta", 1.0, 10);

        // OS DOIS JEITOS ESTAO CERTOS
    }

    void Escrever() {
        System.out.println("Escrevendo com a caneta " + this.name);
    }

    //Caneta caneta1 = new Caneta("Bic", "Azul", 2.5, 100); nao faça isso


    //criando a classe Caneta, metodo consttrutor, atributos e instanciando a classe no mesmo arquivo
}
