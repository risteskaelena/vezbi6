package zadaca6;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {

		List<String> mail = new ArrayList<>();
		
		for (int i=1; i < 21; i++) {
			mail.add("mail" + i +"@yahoo.com");
		}
		System.out.println(mail);
	}
}
