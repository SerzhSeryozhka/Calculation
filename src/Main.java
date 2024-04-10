import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        try {

        System.out.println("Введите два числа");
        Scanner scanner=new Scanner(System.in);
        int q = scanner.nextInt();
        int w = scanner.nextInt();
        Adder a=new Adder();
        System.out.println(a);
    } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
