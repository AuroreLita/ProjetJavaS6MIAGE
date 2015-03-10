
public class Porte {
	private String nomPorte;
	private PointParking parking;
	private Hall hall;
	
	public Porte(String n, PointParking p)
	{
		nomPorte=n;
		parking=p;
	}
	
	public String getNomPorte()
	{
		return nomPorte;
	}
	
	// ajouter à un hall
}
