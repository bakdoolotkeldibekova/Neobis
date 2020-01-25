import java.util.Scanner;


class Instance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Сколько раз запустить цикл: ");
		int T = scanner.nextInt();
		for(int i = 1; i <= T; i++) {
			System.out.print("Введите возраст: ");
			int initialAge = scanner.nextInt();
			
			// Age < 0
			if(initialAge <= 0) {
				System.out.print("Age is not valid, setting age to 0.\n");
			}

			// 0 < Age < 13
			else if(initialAge > 0 && initialAge < 13) {
				for(int j = initialAge; j < 13; j++) {
					System.out.print("You are young.\n");
				}
			}
			
			// 13 <= Age < 18			
			else if(initialAge >= 13 && initialAge < 18) {
				for(int y = initialAge; y < 18; y++) {
					System.out.print("You are a teenager.\n");
				}
			} 
			
			// Age > 18
			else {
				for(int x = initialAge; x < 30; x++) {
					System.out.print("You are old.\n");
				}
			}
		}		
	}
}


