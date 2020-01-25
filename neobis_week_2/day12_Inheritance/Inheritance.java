import java.util.Scanner;


class Student{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//LastName && FistName
		System.out.print("Введите Фамилию: ");
		String lastName = scanner.nextLine();	
		System.out.print("Введите Имя: ");
		String firstName = scanner.nextLine();

		//ID
		System.out.print("Введите  ID: ");
		int ID = scanner.nextInt();
		
		//Average
		System.out.print("Введите баллы за 1 модуль: ");
		int modul1 = scanner.nextInt();
		System.out.print("Введите баллы за 2 модуль: ");
		int modul2 = scanner.nextInt();		
		int sum_modul = Sum_Modul(modul1, modul2);

		//Result
		System.out.print(">=============================<\n");
		System.out.printf("Name: %s %s\n", LastName, FirstName);
		System.out.printf("ID: %d\n", Math.abs(ID));
		
		//Grade's result
		if(sum_modul >= 90 && sum_modul <= 100) {
			System.out.printf("Grade: O");
		}else if(sum_modul >= 80 && sum_modul <= 90) {
			System.out.printf("Grade: E");
		}else if(sum_modul >= 70 && sum_modul <= 80) {
			System.out.printf("Grade: A");				
		}else if(sum_modul >= 55 && sum_modul < 70) {
			System.out.printf("Grade: P");				
		}else if(sum_modul >= 40 && sum_modul < 55) {
			System.out.printf("Grade: D");				
		}else if(sum_modul < 40) {
			System.out.printf("Grade: T");					
		}else {
			System.out.print("Lose!");	
		}
		System.out.println();
	}

	public static int Sum_Modul(int modul1, int modul2) {
		int sum_modul = (modul1 + modul2) / 2;	
		return sum_modul;
	}
}
/*Надо как-то импортировать модули, сделать ID, Фамилию и Имя, 
попробовать перевести в конструктор или разделить на функции, 
прочитать про Абстрактные классы и вызов и передача данных из класса в класс*/
