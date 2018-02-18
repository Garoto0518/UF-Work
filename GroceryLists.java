import java.util.ArrayList;
import java.util.Scanner;

public class GroceryLists {
	public static void main(String[] args) {
		ArrayList<String> toDoList = new ArrayList<String>();
		System.out.println("Enter items for the shooping list.");
		boolean done = false;
		Scanner keyboard = new Scanner(System.in);

		while (!done) {
			System.out.println("Enter something in your list");
			String entry = keyboard.nextLine();
			toDoList.add(entry);
			System.out.print("More items for the list? ");

			String ans = keyboard.nextLine();
			if (!ans.equalsIgnoreCase("yes"))
				done = true;
		}

		System.out.println("Your grocery list is:");
		int listSize = toDoList.size();
		for(String position:toDoList){
	//	for (int position = 0; position < listSize; position++)
			System.out.println(toDoList);
			System.out.println(toDoList.size());
	}
}}