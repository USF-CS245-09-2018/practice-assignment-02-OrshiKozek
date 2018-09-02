public class LinearSearch implements Practice2Search{
    @Override
    public String searchName() {
        return "linear";
    }
    public int search(int [] arr, int target){
        for (int i = 0; i < arr.length; i++){ //keeps going through the array until the target is found or the end is reached
            if (arr[i] == target)
                return i;
        }
        return -1; //if it goes through the array without finding the target number, return -1
    }


}