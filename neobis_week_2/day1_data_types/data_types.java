import java.util.Scanner;

class Data{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
	
	//Принимаю String значение и добавляю к предложению
        System.out.print("Введите слово которое хотите добавить: ");
        String words = scanner.nextLine();
        System.out.printf("%s is the best place to learn and practice coding!.\n", words);

        //Сумма целочисленных значений
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int Sum = number + (number / 3);
        System.out.printf("Ответ:  %d\n", Sum);

        //Сумма чисел с плавающей точкой
        System.out.print("Введите число с плавающей точкой: ");
        double doub_number = scanner.nextDouble();
        double doub_Sum = doub_number + doub_number;
        System.out.printf("Ответ: %.1f\n", doub_Sum);

    }
}
