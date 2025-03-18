public class BinarySearch {
    int binarySearch (int arr[],int x){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) return mid;
            if(arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        return - 1;
    }

    public String binarySearchComplement(int arr[], int x){
        int result = binarySearch(arr, x);
        if (result==-1){
            return "Element is not present in array";
        }else{
            return "Element is present at index " + result;
        }
    }
    int binarySearchRecursive(int arr[], int low, int high, int x){
        if (high >= low){
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] > x) return binarySearchRecursive(arr, low, mid -1, x);
            return binarySearchRecursive(arr,mid+1,high,x);
        }
        return -1;
    }

    public String binarySearchRecursiveComplement(int arr[],int x){
        int result = binarySearchRecursive(arr,0,arr.length,x);
        if (result == -1){
            return "Element is not present in array";
        }else {
            return "Element is present at index " + result;
        }
    }
}
