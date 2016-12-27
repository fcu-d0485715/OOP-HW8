package fcu.iecs.oop.pokemon;

public class Psyduck extends Pokemon {

	public Psyduck(String nickName,PokemonType type,int cp) {
		super(nickName, type, cp);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attack() {
		System.out.println("\"Aqua Tail...\"");

	}
}
