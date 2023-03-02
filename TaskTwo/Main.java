import java.util.Scanner;


class Main{
	

	

	public static void main(String[] args) {
		int retireAge = 67;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please type your name");

		String name = scan.nextLine();

		System.out.println("Welcome " + name);

		System.out.println("Please type your age");

		int age = scan.nextInt();

		System.out.println(age);

		int yearsToRetire = retireAge - age;

		System.out.println("You can retire after " + yearsToRetire + " years.");





	}


}