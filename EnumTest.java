import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Please choose server 1/2/3");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println(Environments.DEVELOPMENT);
            case 2 -> System.out.println(Environments.STAGING);
            case 3 -> System.out.println(Environments.PRODUCTION);
        }
    }
}
