import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FindRepeating findRepeating = new FindRepeating();
        Integer[] numbers = {1,2,3,4,5,6,7,4,5};
        ArrayList<Integer> numbersRepeated = findRepeating.findRepeating(numbers);
        System.out.println(numbersRepeated);
    }
}