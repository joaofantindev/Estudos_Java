package API.polimorfismo;

public abstract class SerVivo {
    public int idade;

    public SerVivo(int idade){
        this.idade = idade;
    }

    public abstract void respirar();

    public void dormir(){
        System.out.println("Dormindo");
    }
}
