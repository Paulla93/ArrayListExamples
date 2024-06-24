package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
	public void run(){
		Scanner myScanner = new Scanner(System.in);

		ArrayList<String> myArr = new ArrayList<>();
		myArr.add("Italian Riviera");
		myArr.add("Jersey Shore");
		myArr.add("Puerto Rico");
		myArr.add("Los Cabos Corridor");
		myArr.add("Lubmin");
		myArr.add("Coney Island");
		myArr.add("Karlovy Vary");
		myArr.add("Bourbon-l'Archambault");
		myArr.add("Walt Disney World Resort");
		myArr.add("Barbados");

		System.out.println("Stupid Vacation Resort Adviser");
		System.out.println("Enter your name:");
		String name = myScanner.next();
		Integer nameLength = name.length();
		if (nameLength == 0)
		{
			System.out.println("empty name entered");
			return;
		}

		Integer vacationIndex = nameLength % myArr.size();

		System.out.println("\nYour name is "+name+", its length is " + 
				nameLength + " characters,\n" +
				"that's why we suggest you to go to "
				+ myArr.get(vacationIndex));
		myScanner.close();
	}
}

