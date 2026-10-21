package API.classes;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Carro carro1 = Carro.createCarro("Civic", "Honda", 2022);
        Carro carro2 = Carro.createCarro("Corolla", "Toyota", 2021);
        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);

        for (Carro carro : carros) {
            System.out.println("Modelo: " + carro.modelo);
            System.out.println("Ano: " + carro.ano);
            // Note: marca is private, so we cannot access it directly here
        }
    }
}
