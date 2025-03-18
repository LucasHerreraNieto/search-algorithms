import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MissingAndRepeating finder = new MissingAndRepeating();
        Integer[] input = {1, 2, 3, 3, 5,5  }; // Ejemplo de entrada
        ArrayList<Integer> result = finder.missingAndRepeating(input);

        System.out.println("Número repetido y faltante: " + result);
    }
}