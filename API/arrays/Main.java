package API.arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] colecaoInteiros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String[] colecaoStrings = new String[10];
        colecaoStrings[0] = "String 1";
        colecaoStrings[1] = "String 2";
        colecaoStrings[2] = "String 3";

        System.out.println("rodando array ja definido");

        for (int i = 0; i < colecaoInteiros.length; i++) {
            System.out.println(colecaoInteiros[i]);
        }

        //classe - deve ser importada do java.utils
        ArrayList<String> arrayStrings = new ArrayList<String>();
        arrayStrings.add("String 1");
        arrayStrings.add("String 2");
        arrayStrings.add("String 3");
        System.out.println(arrayStrings.get(2));
        
        System.out.println("rodando array de strings");
        for (String s : arrayStrings) {
            System.out.println(s);
        }
    }
    
}