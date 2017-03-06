import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x0 = scanner.nextInt();
            int y0 = scanner.nextInt();
            int x = Math.abs(scanner.nextInt() - x0), y = Math.abs(scanner.nextInt() - y0);
            System.out.println(Math.sqrt(x * x + y * y));
        }
    }

