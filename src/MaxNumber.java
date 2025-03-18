public class MaxNumber {
    public int maxNumberInArray(int[] arr){
        int maxNumber = arr[0];
        for (int i = 0; i < arr.length -1; i++){
            if (maxNumber < arr[i]){
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }
}
