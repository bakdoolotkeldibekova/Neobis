import java.util.Scanner;

class Arichmetica{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Ввожу число чьи делители буду находить
		System.out.print("Введите число: ");
		int number = scanner.nextInt();
		int sumDivison = AdvancedArithmetic(number);

		//result
		System.out.print(">===============================<\n");
		System.out.print("I implemented: AdvancedArithmetic\n");		
		System.out.printf("Ответ: " + sumDivison);
		System.out.println();
		scanner.close();
	}
	
	public static int AdvancedArithmetic(int number) {
		int sumDivison = 0;
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				System.out.printf("Число " + number + " делится на " + i + "\n");
				sumDivison = sumDivison + i;							
			}else{
				//Если число не удовлетворяет условию то его пропускаю			
			} 	
		}	
		return sumDivison;
	}
}
