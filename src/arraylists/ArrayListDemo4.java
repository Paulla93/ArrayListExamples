package arraylists;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo4 {
	public void run(){
		ArrayList<String> cities = new ArrayList<>();
		cities.add("New York");
		cities.add("Sydney");
		cities.add("Frankfurt");
		cities.add("Delhi");
		cities.add("Milan");
		cities.add("Paris");

		//ListIterator is used to go through a collection and allows changes i.e. deleting
		ListIterator<String> it_cities = cities.listIterator();
		String str_temp= "";
		System.out.println(" Actual size of ArrayList: " + cities.size());
		while (it_cities.hasNext()){
			str_temp = it_cities.next().toString();
			if(str_temp.equals("Sydney"))
				it_cities.remove();
			else
				System.out.println(" -ListIterator- " + str_temp);
		}
		// ListIterator removed Sydney from ArrayList so its size is reduced to 5
		System.out.println("Current size of ArrayList: " + cities.size());
		
	}
}