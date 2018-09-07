public class BinaryIterativeSearch implements Practice2Search {

    @Override
    public String searchName() {
        return "binaryiterative";
    }

    @Override
    public int search(int[] arr, int target) {
        int min = 0;
        int max = arr.length;
        int mid = (min + max) / 2;
        while (min < max) {
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) { //the target is in the upper half // }
                min = mid + 1; //sets the min to one plus the mid
                mid = (min + max) / 2; //sets mid to the middle of the 'new', smaller array
                //max stays the same
            }
            else {//the last option is if the target is below the middle
                max = mid - 1; //sets the max to be the one less than the mid
                mid = (min + max) / 2; // mid = (min + max) / 2; //changes the mid to the middle of the 'new', smaller array
                //min is not changed
            }
        }
        return -1; //if the target is never found, then return -1

    }
}