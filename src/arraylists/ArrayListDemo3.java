package arraylists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo3 {
	public void run(){
		// Declare variables.
		Scanner myScanner = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();

		System.out.println("Enter a sentence one word at a time ending in a full stop");
		while (!myScanner.hasNext("[.]")) {
			// Read input one word at a time, adding it to an array list.
			words.add(myScanner.next());
		}

		// Sort the words.
		Collections.sort(words);

		// Print the sorted list.
		System.out.println("\n\nSorted words\n");
		for (String word : words) {
			System.out.println(word);
		}
		myScanner.close();
	}
}

