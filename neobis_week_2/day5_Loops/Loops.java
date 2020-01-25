import java.util.Scanner;

class Loops {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите число на которое будет происходить умножение: ");
		int number_n = scanner.nextInt();
		for(int i = 1; i <= 10; i++) {
			int result = number_n * i;
			System.out.printf("%d x %d = %d\n", number_n, i, result);
		}
	}
}
