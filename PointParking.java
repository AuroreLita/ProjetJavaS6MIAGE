
public class PointParking {
	private String nomParking;
	private boolean contact;
	private Zone sazone;
	private Porte saporte;
	//private boolean occupe;
	
	public PointParking(String n, boolean c, Zone z)
	{
		nomParking=n;
		contact=c;
		sazone=z;
	}
	
	public String getNomParking()
	{
		return nomParking;
	}
	// ajouter une zone
	
	// ajouter une porte
}
