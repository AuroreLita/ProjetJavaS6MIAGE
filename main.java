
public class main {
	public static void main(String[] args) {
		/* Création des zones */
		Zone Mike = new Zone("Mike");
		Zone Papa = new Zone("Papa");
		Zone Romeo = new Zone("Romeo");
		Zone Sierra = new Zone("Sierra");
		Zone Tango = new Zone("Tango");
		Zone Uniform = new Zone("Uniform");
		Zone Victor = new Zone("Victor");
		/* Création de parking */
		PointParking M1 = new PointParking("M1",false, Mike);
		PointParking M2 = new PointParking("M2",false, Mike);
		PointParking M3 = new PointParking("M3",false, Mike);
		PointParking M4 = new PointParking("M4",false, Mike);
		PointParking P1 = new PointParking("P1",true, Papa);
		PointParking P2 = new PointParking("P2",true, Papa);
		PointParking P4 = new PointParking("P4",true, Papa);
		PointParking R1 = new PointParking("R1",true, Romeo);
		PointParking R2 = new PointParking("R2",true, Romeo);
		PointParking S4 = new PointParking("S4",true, Sierra);
		PointParking S5 = new PointParking("S5",true, Sierra);
		PointParking T3 = new PointParking("T3",true, Tango);
		PointParking T7 = new PointParking("T7",true, Tango);
		PointParking U4 = new PointParking("U4",true, Uniform);
		PointParking V6 = new PointParking("V6",true, Victor);
		PointParking V7 = new PointParking("V7",true, Victor);
		/* ajout des parking aux zones */
		Mike.addParking(M1);
		Mike.addParking(M2);
		Mike.addParking(M3);
		Mike.addParking(M4);
		Papa.addParking(P1);
		Papa.addParking(P2);
		Papa.addParking(P4);
		Romeo.addParking(R1);
		Romeo.addParking(R2);
		Sierra.addParking(S4);
		Sierra.addParking(S5);
		Tango.addParking(T3);
		Tango.addParking(T7);
		Uniform.addParking(U4);
		Victor.addParking(V6);
		Victor.addParking(V7);
		/* création des portes */
		Porte p10A = new Porte("10A", P1);
		Porte p10B = new Porte("10B", P2);
		Porte p10C = new Porte("10C", P4);
		Porte p20 = new Porte("20", R1);
		Porte p21 = new Porte("21", R2);
		Porte p22 = new Porte("22", S4);
		Porte p23 = new Porte("23", S5);
		Porte p24 = new Porte("24", T3);
		Porte p30 = new Porte("30", T7);
		Porte p31 = new Porte("31", U4);
		Porte p32 = new Porte("32", V6);
		Porte p33 = new Porte("33", V7);
		//Porte p40 = new Porte("40");
		//Porte p41 = new Porte("41");
		//Porte p42 = new Porte("42");
		
		
	}

}
