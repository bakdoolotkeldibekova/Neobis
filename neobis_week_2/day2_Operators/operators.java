import java.util.Scanner;
import java.lang.Math;

class Operat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner - это класс, new - выделяет память
		System.out.print("\nВведите значение с плавающей точкой: ");
		double mealCost = scanner.nextDouble();		
		System.out.print(">================================================<\n\n");

		//=========================================================
		System.out.printf("Введите целое число: ");
		int tipPercent = scanner.nextInt();
		System.out.print(">================================================<\n\n");
		
		//=========================================================		
		System.out.print("Введите целое число: ");
		int taxPercent = scanner.nextInt();
		System.out.print(">================================================<\n\n");
		scanner.close();	
		
		//получаю tip и tax
		double tip = Tip(mealCost, tipPercent);		
		double tax = Tax(mealCost, taxPercent);		
		System.out.printf("tip: %.1f\t", tip);
		System.out.printf("tax: %.2f\n", tax);
		System.out.print(">================================================<\n\n");
		
		//=========================================================		
		double totalCost = Totalcost(mealCost, tip, tax);

		//=========================================================
		System.out.printf("Ответ(без округления): %.2f\n", totalCost);
		System.out.printf("Ответ(с округлением):");
		System.out.println(Math.round(totalCost));
	}
	
	public static double Tip(double mealCost, int tipPercent) {
		double tip = mealCost * tipPercent / 100;
		return tip;
	}
	
	public static double Tax(double mealCost, int taxPercent) {
		double tax = mealCost * taxPercent / 100;
		return tax;
	}

	public static double Totalcost(double mealCost, double tip, double tax) {
		double totalCost = mealCost + tip + tax;
		//System.out.printf("Ответ: %.2f\n", totalCost);
		return totalCost;
	}
}

/*
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / 100;

        double tax = meal_cost * tax_percent / 100;

        double total_cost = meal_cost + tip_percent + tax_percent;

        System.out.println(Math.round(total_cost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);
        scanner.close();
    }
}

*/
