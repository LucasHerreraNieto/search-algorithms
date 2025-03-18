public class SearchAlgorithms {
    private LinearSearch linearAlgorith = new LinearSearch();
    private BinarySearch binaryAlgorith = new BinarySearch();
    private TwoPointers twoPointers = new TwoPointers();
    private MaxNumber maxNumber = new MaxNumber();

    public String linearSearch (Integer[] arr,int x){
        return linearAlgorith.linearSearchComplement(arr, x);
    }
    public String binarySearch(int[] arr, int x){
        return binaryAlgorith.binarySearchComplement(arr, x);
    }
    public String binarySearchRecursive(int[] arr, int x){
        return binaryAlgorith.binarySearchRecursiveComplement(arr, x);
    }
    public String twoPointer(int[] arr, int x){
        return twoPointer(arr, x);
    }
    public int maxNumber(int[] arr){
        return maxNumber.maxNumberInArray(arr);
    }
}
