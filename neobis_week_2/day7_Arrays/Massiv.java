import java.util.Scanner;

public class Massiv {
	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите размер массива: ");
		int n = scanner.nextInt();
		int[] num_array = new int[n];

		System.out.print("Введите числа которые будут переданы в массив: \n");
		for(int i = 0; i < num_array.length; i++) {
			num_array[i] = scanner.nextInt();
		}			
		
		System.out.print("Отсортированные: \n");
		for (int j = (num_array.length - 1); j >= 0; --j) {
	       		System.out.print(num_array[j] + " ");	// Вывожу на экран, полученный массив через пробел
    		}
		System.out.println();
	}
}
