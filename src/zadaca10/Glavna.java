package zadaca10;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {

		List<String> lista1 = new ArrayList<>();
		List<String> lista2 = new ArrayList<>();
		
		lista1.add("Proces");
		lista1.add("Kletnici");
		
		lista2.add("Pirej");
		lista2.add("Crnila");
		
		lista1.addAll(lista2);
		
		System.out.println(lista1);

	}

}
