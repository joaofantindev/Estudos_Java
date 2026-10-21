package API.heranca;

public abstract class SerVivo {
    public int idade; //atributo da classe abstrata

    public SerVivo(int idade) { //construtor da classe abstrata
        this.idade = idade;
    }

    public static SerVivo criarSerVivo(int idade) { //metodo estatico da classe abstrata
        return new Humano(); //retorna um objeto da classe Humano
    }

    public abstract void respirar(); //metodo abstrato, nao tem corpo, apenas assinatura

    public void dormir() { //metodo concreto, tem corpo
        System.out.println("Dormindo");
    }
    Humano humano1 = new Humano(); //instanciamos a classe, nao a classe abstrata
    
    SerVivo serVivo1 = new Humano(); //polimorfismo

}
// classe abstrata, diferente de interface, a gente pode criar metodos e 
// atributos mas nao podemos instanciar a classe, apenas herdar ela