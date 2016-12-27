package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable{

	private String nickName;
	private final PokemonType type;
	private int cp;
	

	Pokemon(String nickName, PokemonType type, int cp)
	{
	  this.nickName = nickName;
	  this.type = type;
	  this.cp = cp;
	  
	}
	
	public String getnickName()
	{
	  return this.nickName; 
	}
	
	public void setNickName(String nickName){
		this.nickName=nickName;
	}
	
	public  PokemonType getType()
	{
	  return this.type; 
	}

	public int getCp()
	{
	  return this.cp;
	}

	public void setCp(int cp)
	{
	  this.cp = cp;
	}
	
}
	