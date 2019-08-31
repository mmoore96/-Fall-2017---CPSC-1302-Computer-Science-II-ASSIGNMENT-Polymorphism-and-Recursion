public abstract class Character {
	private String characterName;
	private String actorName;

	abstract String speak();
	
	public Character(){
		setCharacterName("");
		setActorName("");
	}

	public Character(String characterName, String actorName) {
		setCharacterName(characterName);
		setActorName(actorName);
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;

	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getCharacterName() {
		return characterName;
	}

	public String getActorName() {
		return actorName;
	}

	public String toString() {
		return characterName + actorName;

	}

}
