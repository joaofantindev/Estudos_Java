package API.polimorfismo;

public class Main {
    public static void main(String[] args) {
        SerVivo ser1 = new Humano();
        SerVivo ser2 = new Cachorro();

        ser1.respirar();
        ser2.respirar();
    }
}
