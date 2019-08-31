import java.util.Random;

public class Tester {
	public static void main(String[] args) {
		Character[] Char = new Character[10];

		Char[0] = new CartoonCharacter("Bugs Bunny", " (Robert De Niro) : ");
		Char[1] = new ShakespeareCharacter("CLaunce", " (Jack Nicholson) : ");
		Char[2] = new CartoonCharacter("Scooby-Doo", " (Tom Hanks) : ");
		Char[3] = new ShakespeareCharacter("Lavatch", " (Marlon Brando) : ");
		Char[4] = new CartoonCharacter("Mickey Mouse", " (Leonardo DiCaprio) : ");
		Char[5] = new ShakespeareCharacter("Monsieur LeFer", " (Johnny Depp) : ");
		Char[6] = new CartoonCharacter("Homer Simpson", " (Laurence Olivier) : ");
		Char[7] = new ShakespeareCharacter("Leonardo", " (Brad Pitt) : ");
		Char[8] = new CartoonCharacter("Daffy Duck", " (Tom Cruise) : ");
		Char[9] = new ShakespeareCharacter("The Bishop of Lincoln", " (Sam Elliott) : ");
		generateScript(Char);
	}

	public static void generateScript(Character[] arr) {
		for (int counter = 1; counter <= 10; counter = counter + 1) {
			int i = new Random().nextInt(arr.length);
			System.out.print(arr[i]);
			System.out.print(arr[i].speak());
			System.out.print("\n");
		}
	}

}
