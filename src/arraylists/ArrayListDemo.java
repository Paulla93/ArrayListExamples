package arraylists;

import java.util.ArrayList;

public class ArrayListDemo {
	public void run(){
	    ArrayList al = new ArrayList();
	    System.out.print("Initial size of al :  " + al.size());
	    System.out.print("\n");

	    //add.elements to the array list
	    al.add("C");
	    al.add("A");
	    al.add("E");
	    al.add("B");
	    al.add("D");
	    al.add("F");

	    //display the array list
	    System.out.print("contents of al: " +  al );
	    System.out.print("\n");

	    al.add(1,"A2");//inserts objects "A2" into array at index 1
	    al.add(6, "P28");

	    System.out.print("size of al after additions " + al.size());
	    System.out.print("\n");

	    //display the array list
	    System.out.print("contents of al after A2 added: " +  al );
	    System.out.print("\n");

	    //Remove elements from the array list
	    al.remove("F");
	    al.remove(2);
	    al.remove(0);

	    System.out.print("size of after deletions : " + al.size());
	    System.out.print("\n");
	    System.out.print("contents of al after deletions:" + al);
	    
	  }
}

