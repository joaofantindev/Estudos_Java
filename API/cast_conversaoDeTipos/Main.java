package API.cast_conversaoDeTipos;

public class Main {
    String valorInicial = "123.45"; // String
    double valorConvertido = Double.parseDouble(valorInicial); // Conversão para double
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Valor inicial (String): " + main.valorInicial);
        System.out.println("Valor convertido (double): " + main.valorConvertido);
        
        double resultado = 0.0;
        int resultadoint = (int) resultado; // Conversão de double para int
        System.out.println("Resultado (int): " + resultadoint);
    }
}
 