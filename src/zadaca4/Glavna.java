package zadaca4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Glavna {

	public static void main(String[] args) {
		List<Integer> broevi = new ArrayList<>();
		
		broevi.add(4);
		broevi.add(15);
		broevi.add(76);
		broevi.add(1);
		broevi.add(56);
		
		Collections.sort(broevi);
		
		System.out.println("Sortirani elementi: ");

        for(int i=0; i<broevi.size();i++ ) {
            System.out.println(broevi.get(i));
        }
	}

}
