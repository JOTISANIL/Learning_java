import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        }
    }
