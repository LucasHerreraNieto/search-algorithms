import java.util.ArrayList;
import java.util.List;

public class FindRepeating {
    public ArrayList<Integer> findRepeating(Integer[] arr) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (number == arr[j] && !numbers.contains(arr[j])) {
                    numbers.add(arr[j]);
                }
            }
        }

        return numbers;
    }
}