public class BinaryRecursiveSearch implements Practice2Search{

    @Override
    public String searchName() {
        return "binaryrecursive";
    }

    @Override
    public int search(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length);
    }
    private int binarySearch(int[] arr, int target, int min, int max){
        int mid = (min+max)/2;
        while(min < max){
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) //the target is in the upper half
                return binarySearch(arr, target, mid+1, max);
            else //the target is in the lower half
                return binarySearch(arr, target, min, mid-1);
        }
        return -1;
    }
}