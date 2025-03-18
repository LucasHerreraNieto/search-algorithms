import java.util.Arrays;

public class FindMissingNumber {
    public int missingNumber(int[] arr){
        Arrays.sort(arr);
        for (int i = 1; i < arr.length -1 ;i++){
            if (arr[i] + 1 != arr[i+1] ){
                return arr[i] +1;
            }
        }
        return -1;
    }

}
