import java.util.Scanner;

public class adding2numbers {
    public static void main(String[] args) {
        System.out.println("Please Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Please enter a second number : ");
        int num2 = scanner.nextInt();
        System.out.println("Their sum is : ");
        System.out.println(num1 + num2);
    }
}
