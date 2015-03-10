import java.util.Hashtable;


public class Hall {
	private int numHall;
	private Hashtable lesPortes = new Hashtable(); /* clé : NomPorte */
	
	public Hall(int n)
	{
		numHall=n;
	}
	
	// ajouter une porte
	public void addPorte(Porte p)
	{
		lesPortes.put(p.getNomPorte(), p);
	}
}
