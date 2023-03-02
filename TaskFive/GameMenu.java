import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
	

	private ArrayList<String> actions = new ArrayList<String>();


	public GameMenu(ArrayList<String> list){

		list = actions;
				
	}

	public void displayMenu(ArrayList<String> list){
		for(String s : list){
			System.out.println(s);
		}
	}	

	public String getAction(ArrayList<String> list){
		Scanner scan = new Scanner(System.in);
		//String choice;

		System.out.println("Type a number to choose an action");

			for(String s : list){
			System.out.println(s);
		}

		String choice = scan.nextLine();
		return choice;

		}	

		


}