import java.util.Random;

public class CartoonCharacter extends Character {

	public CartoonCharacter(String characterName, String actorName) {
		super(characterName, actorName);

	}

	String speak() {
		String a = ("Eh, what's up, doc? You can't shoot a wabbit.");
		String b = ("Don’t Ask Questions. I Just Have Fun!");
		String c = ("I’d be vegetarian if bacon grew n trees");
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
