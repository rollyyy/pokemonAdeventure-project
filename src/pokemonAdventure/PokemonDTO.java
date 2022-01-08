package pokemonAdventure;

public abstract class PokemonDTO {
	protected int hp = 100;
	public int mission = (int)(Math.random()*3)+3;
	protected int count = 0;
	
	public abstract void recharge();
	
	public abstract void attack();
	
	public abstract void PokemonDTO();

	

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
}
