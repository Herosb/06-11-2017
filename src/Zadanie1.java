
import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) {
		double avg;
		int min = 0, max = 0, n = 10, sum = 0, biggerThanAvg = 0, LowerThanAvg = 0;
		int[] arr = new int[10];
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(21) - 10;
			System.out.print((i > 0 ? "," : "") + arr[i]);
			if (i == 0) {
				min = arr[0];
				max = arr[0];
			} else {
				if (arr[i] > max)
					max = arr[i];
				if (arr[i] < min)
					min = arr[i];
			}
			sum += arr[i];
		}
		System.out.println("");
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		avg = (double) sum / n;
		System.out.println("Avg: " + avg);
		for (int i = 0; i < arr.length; i++)
			;
		{
			if (arr[i] < avg)
				LowerThanAvg++;
			else
				biggerThanAvg++;
			System.out.println("");
			System.out.println("lower than the average: ");
			System.out.println("bigger than the average: ");

		}

	}
}
