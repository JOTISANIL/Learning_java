import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.next();
        greeting(name);
    }
    static void greeting(String name){
        System.out.println("Hello " + name);
    }
}
