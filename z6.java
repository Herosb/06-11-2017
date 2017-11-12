import java.util.Scanner;

public class z6 {

	public static void main(String[] args) {

		int znak = 0, x = 0;
		int[] arr = new int[32];

		System.out.println("Podaj liczbê:");
		int liczba;
		Scanner odczyt = new Scanner(System.in);
		liczba = odczyt.nextInt();
		System.out.println("Podales liczbe " + liczba);
		if (liczba > 0)
			znak = 0;
		else {
			znak = 1;
			liczba = liczba * -1;
		}
		System.out.print(znak + ".");

		for (int i = 0; i < 32; i++) {
			arr[i] = liczba % 2;
			liczba = liczba / 2;
			System.out.print(arr[31 - i]);
		}

		System.out.print("\n Wynik ZU1:");
		System.out.print(znak + ".");

		for (int i = 0; i < 32; i++) {
			liczba = arr[31 - i];
			if (znak == 1) {
				if (liczba == 0)
					liczba = 1;
				else
					liczba = 0;
			}
			arr[31 - i] = liczba;
			System.out.print(liczba);
		}

		if (znak == 1) {
			for (int i = 0; i < 32; i++) {
				liczba = arr[i];
				if (liczba == 0 && x == 0)
					arr[i] = 1;
				else
					x = 1;
			}
		}
		System.out.print("\n Wynik ZU2:");
		System.out.print(znak + ".");
		for (int i = 0; i < 32; i++) {
			liczba = arr[31 - i];
			System.out.print(liczba);
		}

	}

}
