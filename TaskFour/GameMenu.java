import java.util.ArrayList;

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


}