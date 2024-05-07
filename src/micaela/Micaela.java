package micaela;

import dao.TuNombreDao;
import dao.TuNombreDaoImpl;

public class Micaela {
private static TuNombreDao personal;
	
	static {
		personal = new TuNombreDaoImpl();
	}
	
	public static void main(String[] args) {
		System.out.println(personal.mellamo("Micaela", "Palomero"));
	}
}
