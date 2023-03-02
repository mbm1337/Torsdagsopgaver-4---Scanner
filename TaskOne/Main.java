class Main{


	public static void main(String [] args){

		Team t1 = new Team("TeamOne");
		Team t2 = new Team("TeamTwo");
		Team t3 = new Team("TeamThree");
		Team t4 = new Team("TeamFour");
		Team t5 = new Team("TeamFive");
		Team t6 = new Team("TeamSix");


		t1.setRank(4);
		t2.setRank(10);
		t3.setRank(6);
		t4.setRank(2);
		t5.setRank(7);
		t6.setRank(1);




		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		System.out.println(t6);


	}


}