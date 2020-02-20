import java.util.Scanner;
public class foobar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number%2 == 0)
            System.out.println("foo < " + number + " >");
        else
            System.out.println("bar < " + number + " >");
    }
}
