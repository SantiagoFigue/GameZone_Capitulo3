package GameZone_Capitulo3;

public class PickTwoCards {
	private Card carta1;
	private Card carta2;
	
	public PickTwoCards(){
		this.carta1= new Card();
		this.carta2= new Card();
	}
	
	
	public Card getCarta1() {
		return carta1;
	}
	public void setCarta1(Card carta1) {
		this.carta1 = carta1;
	}
	public Card getCarta2() {
		return carta2;
	}
	public void setCarta2(Card carta2) {
		this.carta2 = carta2;
	}
	
	

}
