package practise;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	
	public static void main( String [] args) {
		List <Boolean> list = new ArrayList<>();
		list.add(true);
		list.add(Boolean.parseBoolean("FalSe"));
		list.add(Boolean.TRUE);
		System.out.println(list.size());
		System.out.println(list.get(1) instanceof Boolean);
		System.out.println("My first Git COde setup");
		
	}

}
