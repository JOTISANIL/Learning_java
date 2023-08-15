import java.util.Scanner;

public class DecimalBinary {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int num = in.nextInt();
       binary(num);
    }

    private static void binary(int n) {

        int[] binaryNum = new int[30];
        int i = 0;
        while (n>0){
            binaryNum[i] = n%2;
            n = n/2;
            i++;

        }
        for (int j=i-1; j>=0; j--){

            System.out.print(binaryNum[j]);
        }
    }
}
