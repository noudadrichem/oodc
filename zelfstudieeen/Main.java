package zelfstudieeen;

public class Main {
	public static void main(String[] args) {
		Zelfstudie1 k1 = new Zelfstudie1();
		
		k1.forLoop();
		System.out.println(" ");
		k1.whileLoop();
		System.out.println(" ");
		System.out.println(k1.getRandomIntBetween(0));
		System.out.println(k1.getRandomIntBetween(10));
		System.out.println(" ");
		System.out.println(k1.loopedSum());
		System.out.println(" ");
		k1.sawStringPattern();
	}
}
