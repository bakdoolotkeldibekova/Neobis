import java.util.Scanner;

class Bool{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("[1]Сравнение 2-х чисел\n[2]Сравнение 3-х чисел\n[3]Сравнение 4-х чисел\n");
		System.out.print(">>> ");
		int switch_i = scanner.nextInt();
		
		switch(switch_i) {
			case 1:
				System.out.print("Введите a: ");
				int num_a = scanner.nextInt();

				System.out.print("Введите b: ");
				int num_b = scanner.nextInt();
		
				if(num_a == num_b) {
					if(num_b != num_a) {
						System.out.print("true");					
					}else{	
						System.out.print("false");
					}			
				}else{
					System.out.print(num_a + " is not " + num_b);		
				}
				break;

			case 2:
				System.out.print("Введите a: ");
				int num_x = scanner.nextInt();

				System.out.print("Введите b: ");
				int num_y = scanner.nextInt();

				System.out.print("Введите c: ");
				int num_c = scanner.nextInt();

				if(num_x == num_y) {
					if(num_y == num_c) {
						if(num_x == num_c) {
							System.out.print("true");
						}
					}else if(num_y != num_c){
						System.out.print("false");											
					}				
				}
				break;
		
			case 3:
				System.out.print("Введите c: ");
				int num_q = scanner.nextInt();

				System.out.print("Введите b: ");
				int num_w = scanner.nextInt();

				System.out.print("Введите d: ");
				int num_e = scanner.nextInt();

				System.out.print("Введите x: ");
				int num_r = scanner.nextInt();

				System.out.print("Введите z: ");
				int num_t = scanner.nextInt();

				if(num_q == num_q) {
					if(num_w == num_e) {
						if(num_r != num_t) {
							System.out.print("true");
						}
					}															
				}
				break;				
		}
		System.out.println();	
	}
}
