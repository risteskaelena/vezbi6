package zadaca3;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		
		List<String> smerovi = new ArrayList<>();
		
		smerovi.add("INKI");
		smerovi.add("IKT");
		smerovi.add(2, "SIIS");
		System.out.println("Elementite na listata se: " + smerovi);	}

}
