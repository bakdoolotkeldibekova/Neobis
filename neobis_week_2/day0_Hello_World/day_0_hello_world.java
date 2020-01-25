import java.util.Scanner;

class Hello_World{
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Input your text: ");
        String text = scanner.nextLine();
        System.out.printf("Hello World.\n%s\n",text);
        scanner.close();
    }
}
