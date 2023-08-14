import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.printf("type 2 num and operator");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String op = sc.next();

        switch (op) {
            case "+" -> System.out.println(n+m);
            case "-" -> System.out.println(n-m);
            case "*" -> System.out.println(n*m);
            case "/" -> System.out.println(n/m);
            default -> System.out.println("invalid");
        }

        }
    }
