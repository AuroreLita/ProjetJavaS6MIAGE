import java.util.Hashtable;


public class Zone {
	private String nomZone;
	private Hashtable lesparking = new Hashtable(); /* clé : NomPorte */
	//private int acces;
	
	public Zone(String n)
	{
		nomZone=n;
	}
	
	public void addParking(PointParking p)
	{
		lesparking.put(p.getNomParking(), p);
	}
}
