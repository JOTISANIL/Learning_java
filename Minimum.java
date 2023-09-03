public class Minimum {
    public static void main(String[] args) {
        int[] arr = {333,4,3,6,33,43};
        int min = mini(arr);
        System.out.println(min);
    }

     static int mini(int[] arr) {
        if(arr.length==0){
            return -1;
        }
        int temp = arr[0];
        for (int a:arr){
            if(a<temp){
                temp = a;
            }
        }
        return temp;
    }
}
