package arraylists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class ArrayListDemo5 {
	
	
	public void run(){
		Scanner input = new Scanner(System.in);
	ArrayList<Person> persons = new ArrayList<Person>();
	
	Person p1 = new Person("Joshua", 18, "male"); 
	Person p2 = new Person("Mimi", 40, "female"); 
	Person p3 = new Person("Riddhi", 28, "female"); 
	Person p4 = new Person("Milena", 24, "female"); 
	Person p5 = new Person("John", 33, "male"); 
	
	persons.add(p1);
	persons.add(p2);
	persons.add(p3);
	persons.add(p4);
	persons.add(p5);
	
	
	

	Iterator<Person> itr=persons.iterator();

    while(itr.hasNext())
    {
        Person persons1 = itr.next();

        System.out.print("Age:"+ persons1.getAge());
        System.out.print(" Name:"+persons1.getName());
        System.out.println(" Sex:"+persons1.getSex());
}

    System.out.println("\nAfter changes\n");
    persons.remove(2);
    Person p6 = new Person("Lena", 33, "female");
    persons.add(0, p6);
    
    Iterator<Person> itr1=persons.iterator();

    while(itr1.hasNext())
    {
        Person persons1 = itr1.next();

        System.out.print("Age:"+ persons1.getAge());
        System.out.print(" Name:"+persons1.getName());
        System.out.println(" Sex:"+persons1.getSex());
}
    System.out.println("\n\n");
    System.out.print("Please enter the first name to search for or q to quit: ");
    
	String searchName = input.next().trim().toUpperCase();
    if (searchName.equals("Q") == false)
    {
        boolean found = false;
        for(Person a: persons){ 
           if(a.getName().toUpperCase().equals(searchName)){
               System.out.println("Person details: ");
               System.out.println("name: " + a.getName());
               System.out.println("Age: " + a.getAge());
               System.out.println("Sex: " + a.getSex());
               found = true;
               break;
               }

        if(found == false)
        { 
           System.out.println("Item Not Found!");
        }
    }
}
	}
	
}

