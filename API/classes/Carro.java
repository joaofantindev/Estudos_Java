package API.classes;

public class Carro {
    public String modelo;
    private String marca;
    protected int ano;

    private Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public static Carro createCarro(String modelo, String marca, int ano) {
        return new Carro(modelo, marca, ano);
    }

    //o metodo de criacao é publico, mas o construtor é privado, garantindo que os objetos Carro só possam ser criados através do método createCarro
    // sem a necessidade de expor o construtor diretamente, mantendo o encapsulamento da classe.

    /*
    public = qualquer lugar pode acessr
    private = apenas a propria classe pode acessar
    protected = a propria classe e as classes filhas podem acessar, mas outro pacote nao
    */
}
class Rodas {
    public int tamanho;
}

// posso criar classes dentro do mesmo arquivo, mas apenas uma pode ser pública e ter o 
// mesmo nome do arquivo. As outras classes 
// devem ser package-private (sem modificador de acesso) ou privadas (se forem internas).