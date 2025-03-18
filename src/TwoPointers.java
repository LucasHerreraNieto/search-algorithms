import java.util.Arrays;

public class TwoPointers {
     boolean twoSum (int[] arr,int x){
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left > right){
            int sum = arr[left] + arr[right];
            if (sum == x) return true;
            else if (sum < x) left++;
            else right--;
        }
        return false;
    }

    public String twoSumComplement(int arr[],int x){
         boolean result = twoSum(arr,x);
         if (result)return "The pair found in array";
         else return "the pair isn`t in array";
    }
}
