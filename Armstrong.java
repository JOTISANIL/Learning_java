import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int num = in.nextInt();
       boolean ans = isArm(num);
        System.out.println(ans);
    }

     static boolean isArm(int a) {

        int original = a;
        int sum = 0;

        while(a>0){
            int rem = a%10;
            a = a/10;
            sum = sum+rem*rem*rem;
        }
        return sum == original;
    }

}
