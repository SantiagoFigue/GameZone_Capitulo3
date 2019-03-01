package GameZone_Capitulo3;

public class Test {
	public static void main(String[] args) {
		Card carta= new Card(); 
		System.out.println(carta.getValor());
		System.out.println(carta.getSuit());
		
		PickTwoCards cartas = new PickTwoCards();
		System.out.println(cartas.getCarta1().getValor());
		System.out.println(cartas.getCarta1().getSuit());
		System.out.println(cartas.getCarta2().getValor());
		System.out.println(cartas.getCarta2().getSuit());
	}
}
