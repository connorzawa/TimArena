package timArena;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Player {
	public String Name = " ", townName = " ";
	public Citizen[] Builders  = new Citizen[50];
	public Citizen[] Warriors = new Citizen[50];
	public Party[] Parties = {new Party(), new Party(), new Party(), new Party(), new Party(), new Party(), new Party(), new Party(), new Party(), new Party()};
	public Map<Material, Integer> materials = new HashMap<Material, Integer>();
	public int gold, buildersPop, warriorsPop;
	

}
