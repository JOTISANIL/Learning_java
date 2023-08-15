public class RemoveEven {

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int indx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                result[indx] = arr[i];
                indx++;
            }
        }
        return result;
    }

    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,7,11};
        //printArray(arr);
        int[] result = removeEven(arr);
        printArray(result);

    }
}
