import java.util.Scanner;

class Statements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите число для начала проверки: ");
		int number = scanner.nextInt();		
		
		if(number % 2 != 0) {
			System.out.print("Weird!\n");		
		}else if(number > 2 && number <= 5) {
			System.out.print("Not Weird!\n");
		}else if(number > 6 && number < 20) {
			System.out.print("Weird!\n");				
		}else if(number > 20) {
			System.out.print("Not Weird!\n");
		}else{
			System.out.print("Weird!\n");				
		}	
	}
}
