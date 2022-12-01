package zadaca11;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {

		List<String> lista1 = new ArrayList<>();
		List<String> lista2 = new ArrayList<>();
		
		lista1.add("Denicija");
		lista1.add("Beli Mugri");
		
		lista2.add("Cvekjinja na zloto");
		lista2.add("Denicija");
		
		lista1.retainAll(lista2);
		
		System.out.println(lista1);

	}

}
