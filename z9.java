import java.util.Scanner;

public class z9 {

	public static void main(String[] args) {

		int znak = 0, x = 0, znak2 = 0, x2 = 0;
		int[] arr = new int[32];

		System.out.println("Podaj liczbê 1:");
		int liczba;
		Scanner odczyt = new Scanner(System.in);
		liczba = odczyt.nextInt();

		System.out.println("Podaj liczbê 2:");
		int liczba2;
		liczba2 = odczyt.nextInt();

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

		// -------------
		System.out.print("\n");
		int[] arr2 = new int[32];

		System.out.println("Podales liczbe 2: " + liczba2);
		if (liczba2 > 0)
			znak2 = 0;
		else {
			znak2 = 1;
			liczba2 = liczba2 * -1;
		}
		System.out.print(znak2 + ".");

		for (int i = 0; i < 32; i++) {
			arr2[i] = liczba2 % 2;
			liczba2 = liczba2 / 2;
			System.out.print(arr2[31 - i]);
		}

		System.out.print("\n Wynik ZU1:");
		System.out.print(znak2 + ".");

		for (int i = 0; i < 32; i++) {
			liczba2 = arr2[31 - i];
			if (znak2 == 1) {
				if (liczba2 == 0)
					liczba2 = 1;
				else
					liczba2 = 0;
			}
			arr2[31 - i] = liczba2;
			System.out.print(liczba2);
		}

		if (znak2 == 1) {
			for (int i = 0; i < 32; i++) {
				liczba2 = arr2[i];
				if (liczba2 == 0 && x2 == 0)
					arr2[i] = 1;
				else
					x2 = 1;
			}
		}
		System.out.print("\n Wynik ZU2:");
		System.out.print(znak2 + ".");
		for (int i = 0; i < 32; i++) {
			liczba2 = arr2[31 - i];
			System.out.print(liczba2);
		}

		// ------------- w tym miejscu mamy dwie liczby arr[] i arr2[]

		int[] arr3 = new int[32];


		for (int k = 0; k < 32; k++) {



			if (arr2[k] == 1) {

				// suma dwóch liczb
				
				int reszta = 0;
				for (int i = 0; i < 32; i++) {
					liczba = arr3[i] + arr[i] + reszta;
					if (liczba == 0) {
						liczba = 0;
						reszta = 0;
					} else if (liczba == 1) {
						liczba = 1;
						reszta = 0;

					} else if (liczba == 2) {
						liczba = 0;
						reszta = 1;
					} else if (liczba == 3) {
						liczba = 1;
						reszta = 1;
					}
					arr3[i] = liczba;
				}				
				
				System.out.print("\n SUMA LICZB:");
				System.out.print(znak2 + ".");
				for (int i = 0; i < 32; i++) {
					liczba2 = arr3[31 - i];
					System.out.print(liczba2);
				}
				
				
				// przesuniêcie w prawo
				for (int i = 0; i < 31; i++) {
					arr[i] = arr[i+1];
				}
				arr[0] = 0;
				System.out.print("\n liczba1 przesunieta w prawo:");
				System.out.print(znak2 + ".");
				for (int i = 0; i < 32; i++) {
					liczba2 = arr[31 - i];
					System.out.print(liczba2);
				}
				
			}

		}
		
		System.out.print("\n Wynik mno¿enia:");
		System.out.print(znak2 + ".");
		for (int i = 0; i < 32; i++) {
			liczba2 = arr3[31 - i];
			System.out.print(liczba2);
		}
		
	}

}
