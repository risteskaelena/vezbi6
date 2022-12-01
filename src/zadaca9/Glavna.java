package zadaca9;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		
		List<Fakultet> fakulteti = new ArrayList<Fakultet>();
		
		Fakultet fakultet1 = new Fakultet("Filoloski Fakultet", 8, 35);
		fakulteti.add(fakultet1);
		Fakultet fakultet2 = new Fakultet("Medicinski Fakultet", 12, 2800);
		fakulteti.add(fakultet2);
		Fakultet fakultet3 = new Fakultet("PMF", 3, 89);
		fakulteti.add(fakultet3);
		Fakultet fakultet4 = new Fakultet("FDU", 7, 150);
		fakulteti.add(fakultet4);
		Fakultet fakultet5 = new Fakultet("FIKT", 2, 550);
		fakulteti.add(fakultet5);
		
		for (int i = 0; i < fakulteti.size(); i ++){
			System.out.println(fakulteti.get(i).getIme() + " " + fakulteti.get(i).getSmerovi() + " " + fakulteti.get(i).getStudenti());
		}
	}

}
