public class LinearSearch {
    public static int linearSearch(Integer[] arr,int aNumber){
        for (int i = 0; i < arr.length;i++){
            if (arr[i] == aNumber){
                return i;
            }
        }
        return -1;
    }
    public static String linearSearchComplement(Integer[] arr, int aNumber){
        int result = linearSearch(arr, aNumber);
        if (result == -1){
            return "Element is not present in array";
        }else {
            return "Element is present in index: " + result;
        }

    }
}
