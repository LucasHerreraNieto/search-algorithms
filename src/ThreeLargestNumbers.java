import java.util.ArrayList;
import java.util.List;

public class ThreeLargestNumbers {
    private SecondMaxNumber secondMaxNumber = new SecondMaxNumber();
    private MaxNumber maxNumber = new MaxNumber();

    public List<Integer> threeLargestNumbers (int[] arr){
        int max = maxNumber.maxNumberInArray(arr);
        int secondMax = secondMaxNumber.secondMaxNumber(arr);
        int threeMax = -1;
        List<Integer> maxNumbers = new ArrayList<>();

        for (int i = 0; i < arr.length;i++){
            if (arr[i] > threeMax && arr[i] != max && arr[i] != secondMax){
                threeMax = arr[i];
            }
        }
        if (threeMax != -1){
            maxNumbers.add(threeMax);
        }
        return maxNumbers;
    }
}
