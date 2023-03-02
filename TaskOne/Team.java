class Team{
	
	private String teamName;
	private int rank;
	private String namesOfPlayer;


	public Team(String teamName){
		this.teamName = teamName;
	 }

	public int setRank(int rank){
		this.rank = rank;
			return rank;
		}
	/*public int getRank(){
			return this.rank;
		}*/





	@Override
	public String toString(){
		String s = "Team: " + teamName + " Rank: " + rank;
			return s;

	}


}