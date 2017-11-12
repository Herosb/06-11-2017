import java.util.Random;
import java.util.Scanner;

public class z3 {

	public static void main(String[] args) {

		int n = 20,liczba=0;
		int[] arr = new int[n];
		int[] arr2 = new int[10];
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10)+1;
			System.out.print((i > 0 ? "," : "") + arr[i]);
		}

		for (int i = 0; i < n; i++) {
			liczba = arr[i];
			arr2[liczba-1] = arr2[liczba-1]+1;
		}		
		System.out.print("\n");

		for (int i = 0; i < 10; i++) {
			System.out.print("Liczba "+ (i+1) + " wypad³a " + arr2[i] + " razy...\n");
		}		
	}

}
