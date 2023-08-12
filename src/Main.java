import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "mango" -> System.out.println("mango");
            case "apple" -> System.out.println("appleee");
            default -> System.out.println("Not fruit");
        }

    }
    }

