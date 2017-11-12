
import java.util.Random;
import java.util.Scanner;

public class z2 {

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
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < avg) {
				LowerThanAvg++;
				System.out.println(arr[i] + " lower than the average: ");
			} else {
				biggerThanAvg++;
				System.out.println(arr[i] + " bigger than the average: ");
		}	
		}
		System.out.println("amount of lower than average: " + LowerThanAvg++);
		System.out.println("amount of bigger than average: " + biggerThanAvg++);

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i > 0 ? "," : "") + arr[n-1-i]);
		}
		System.out.println("\n");
		for (int i = arr.length; i > 0 ; --i) {
			System.out.print((i == n ? "" : ",") + arr[i-1]);
		}
	}
}