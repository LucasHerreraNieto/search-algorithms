import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeating {
    FindMissingNumber missingNumber = new FindMissingNumber();
    FindRepeating findRepeating = new FindRepeating();

    public ArrayList<Integer> missingAndRepeating(Integer[] arr) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(missingNumber.missingNumber(arr));

        Integer[] repeatingNumbers = findRepeating.findRepeating(arr);
        for (int i = 0; i < repeatingNumbers.length;i++){
            numbers.add(repeatingNumbers[i]);
        }

        return numbers;
    }
}
