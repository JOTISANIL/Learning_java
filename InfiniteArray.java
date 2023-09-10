import java.util.Arrays;

public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = {2,4,5,13,14,17,22};
        int target = 11;
        System.out.println(ans(arr, target));


    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target>arr[end]){

            int newStart = end + 1;
            //double box value
            end = end + (end-start+1)*2;
            start = newStart;

        }
        return binarysearch(arr, target, start, end);
    }


    static int binarysearch(int[] arr, int target, int start, int end) {

        while(start <= end){
            int mid = start + (end-start) / 2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
