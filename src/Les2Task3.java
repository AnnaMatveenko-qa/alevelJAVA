import java.util.Scanner;
public class Les2Task3 {
    public static void main(String[] args) {
        System.out.print("Введите любое  число: ");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        String result = number % 2 <= 0 ? "Число четное!" : "Число нечетное!";
        System.out.println(result);
    }
}
