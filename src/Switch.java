import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        System.out.printf("type fruit");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "apple" -> System.out.println("fruit is red");
            case "mango" -> System.out.println("fruit is yellow");
            case "orange" -> System.out.println("fruit is orange");
            default -> System.out.println("invalid");
        }

        }
    }
