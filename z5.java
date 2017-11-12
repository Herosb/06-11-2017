import java.util.Scanner;
public class z5 {

	public static void main(String[] args) {
		
		int[] arr = new int[32];
		
		System.out.println("Podaj liczbê:");
		int liczba;
		Scanner odczyt = new Scanner(System.in);
		liczba = odczyt.nextInt();
		System.out.println("Podales liczbe " + liczba);
if (liczba > 0)
	System.out.print("0.");
else
{
	System.out.print("1.");
	liczba=liczba*-1;
}
		for (int i = 0; i < 32; i++) {
			arr[i]=liczba%2;
			liczba=liczba/2;
			System.out.print(arr[31-i]);
		}		
		
	}

}
