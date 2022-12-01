package zadaca5;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<Integer> broevi = new ArrayList<>();
		
		broevi.add(4);
		broevi.add(15);
		broevi.add(76);
		broevi.add(1);
		broevi.add(56);
		
		System.out.println("Vtor element: " + broevi.get(1));

	}

}
