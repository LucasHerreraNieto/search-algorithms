public class SecondMaxNumber {
    private MaxNumber maxNumber = new MaxNumber();

    public int secondMaxNumber(int[] arr){
        int max = maxNumber.maxNumberInArray(arr);
        int secondLargest = -1;
        for(int i = 0; i < arr.length; i++){
            if (arr[i]>secondLargest && arr[i]!=max){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

}
