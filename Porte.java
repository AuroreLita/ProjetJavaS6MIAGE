
public class Porte {
	private String nomPorte;
	private PointParking parking;
	private Hall hall;
	
	public Porte(String n, PointParking p)
	{
		nomPorte=n;
		parking=p;
	}
	
	public void addPorte(Porte p)
	{
		lesPortes.put(p.getNomPorte(), p);
	}
	// ajouter à un hall
}
