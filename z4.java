import java.util.Random;
import java.util.Scanner;

public class z4 {

	public static void main(String[] args) {
		int min = 0, max = 0;
		int[][] arr = new int[5][5];
		int[] arrmin = new int[5];
		int[] arrmax = new int[5];
		Random random = new Random();
		System.out.print("Wylosowana macierz:");
		for (int i = 0; i < 5; i++) {
			System.out.print("\n");
			for (int j = 0; j < 5; j++) {
				arr[i][j] = random.nextInt(11) - 5;
				System.out.print((j > 0 ? "," : "") + arr[i][j]);
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.print("\n");
			for (int j = 0; j < 5; j++) {
				if (j == 0) {
					min = arr[i][j];
				} else {
					if (arr[i][j] < min)
						min = arr[i][j];
				}
			}

			arrmin[i] = min;
		}

		System.out.println("Minimalne wartoœci w wierszach:");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ": " + arrmin[i]);
		}

		for (int i = 0; i < 5; i++) {
			System.out.print("\n");
			for (int j = 0; j < 5; j++) {
				if (j == 0) {
					max = arr[j][i];
				} else {
					if (arr[j][i] > max)
						max = arr[j][i];
				}
			}

			arrmax[i] = max;
		}

		System.out.println("Maksymalne wartoœci w kolumnach:");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ": " + arrmax[i]);
		}

		System.out.print("\n");
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				min = arr[i][4-i];
				max = arr[i][i];
			} else {
				if (arr[i][i] < min)
					min = arr[i][4-i];
				if (arr[i][i] > max)
					max = arr[i][i];
			}
		}
		
		System.out.println("Maksimum na pierwszej przek¹tnej:" + max);	
		System.out.println("Minimum na drugiej przek¹tnej:" + min);	
	}
}
