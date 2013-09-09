package timArena;


public class Citizen {

	public int strength, toughness, intellect, dexterity, luck, vitality;
	public String name;
	public boolean male, warrior; 
	
	public Citizen(int strength, int toughness, int dexterity, int intellect, int vitality,  int luck, String name, boolean male, boolean warrior)
	{
		this.strength = strength;
		this.toughness = toughness;
		this.luck = luck;
		this.vitality = vitality;
		this.name = name;
		this.male = male;
		this.warrior = warrior;
		this.dexterity = dexterity;
	}
	
	public void setAttack(int attack)
	{
		this.strength = attack;
	}
	
	public void setDefense(int defense)
	{
		this.toughness = defense;
	}
	
	public void setLuck(int luck)
	{
		this.luck = luck;
	}
	
	public void setVitality(int vitality)
	{
		this.vitality = vitality;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	//----------Gets--------------------
	
	public int getStrength()
	{
		return this.strength;
	}
	
	public int getToughness()
	{
		return this.toughness;
	}
	
	public int getLuck()
	{
		return this.luck;
	}
	
	public int getVitality()
	{
		return this.vitality;
	}
	public int getDexterity()
	{
		return this.dexterity;
	}
	public int getIntellect()
	{
		return this.intellect;
	}
	public String getName()
	{
		return this.name;
	}

	public boolean isMale()
	{
		return this.male;
	}
	
	public boolean isWarrior()
	{
		return this.warrior;
	}
	
		
}
