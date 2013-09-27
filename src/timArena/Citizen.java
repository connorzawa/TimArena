package timArena;


public class Citizen {

	private int strength, toughness, intellect, dexterity, luck, vitality;
	private String name, ID;
	private boolean male, warrior, inAParty, hasShop; 
	
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
	
	public void setShop(boolean shop)
	{
		this.hasShop = shop;
	}
	public void setID(String ID)
	{
		this.ID = ID;
	}
	
	public void setStrength(int strength)
	{
		this.strength = strength;
	}
	
	public void setToughness(int toughness)
	{
		this.toughness = toughness;
	}
	
	public void setLuck(int luck)
	{
		this.luck = luck;
	}
	
	public void setVitality(int vitality)
	{
		this.vitality = vitality;
	}
	
	public void setDexterity(int dexterity)
	{
		this.dexterity = dexterity;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void changePartyStatus()
	{
		if(this.inAParty)
		{
			this.inAParty = false;
		}
		else
		{
			this.inAParty = true;
		}
	}
	//----------Gets--------------------
	
	public boolean getShop()
	{
		return this.hasShop;
	}
	public String getID()
	{
		return this.ID;
	}
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
