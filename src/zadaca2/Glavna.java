package zadaca2;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		
		List<String> drzavi = new ArrayList<>();
		
		drzavi.add("Makedonija");
		drzavi.add("Nepal");
		drzavi.add("Kolumbija");
		drzavi.add("Uganda");
		System.out.println("Broj na elementi: " + drzavi.size());
		
		if (drzavi.size()==3 ) {
			drzavi.add("Maroko");
			drzavi.add("Brazil");
			System.out.println("Elementite na listata se: " + drzavi);
		}
		else {
			System.out.println("Elementite na listata se: " + drzavi);
		}

	}

}
