package timArena;

public class Party {
	protected Citizen[] members = {new Citizen(), new Citizen(), new Citizen(), new Citizen()};
	protected boolean empty = true;
	protected int size = 0;
	
	public void setMembers(Citizen members[])
	{
		if(members.length == 4)
		{
			this.members = members;
		}
	}
	
	public Citizen[] getMembers()
	{
		return this.members;
	}
	
	public void setEmpty(boolean empty)
	{
		this.empty = empty;
	}
	
	public boolean getEmpty()
	{
		return this.empty;
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	public void incrSize()
	{
		this.size++;
	}
	
	public void decrSize()
	{
		this.size--;
	}
}
