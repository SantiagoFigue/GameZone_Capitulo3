package GameZone_Capitulo3;

public class Card {

	private String suit;
	private Integer valor;

	public Card() {
		this.suit = "Diamonds";
		this.valor = barajear();
	}
	
	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	public Integer barajear() {
		return (int) (Math.random()*13)+1;
	}
	
}
