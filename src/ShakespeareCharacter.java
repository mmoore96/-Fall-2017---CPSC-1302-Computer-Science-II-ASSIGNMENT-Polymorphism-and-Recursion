import java.util.Random;

public class ShakespeareCharacter extends Character {

	public ShakespeareCharacter(String characterName, String actorName) {
		super(characterName, actorName);

	}

	String speak() {
		String a = ("Eternity was in our lips and eyes, Bliss in our brows bent.");
		String b = ("Give me to drink mandragora.");
		String c = ("Oft expectation fails, and most oft there, Where most it promises.");
		Random rand = new Random();
		int line = rand.nextInt(3);
		if (line == 0) {
			return a;
		} else if (line == 1) {
			return b;
		} else {
			return c;
		}
	}

}
