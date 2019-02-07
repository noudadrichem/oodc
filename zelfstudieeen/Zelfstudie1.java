package zelfstudieeen;

public class Zelfstudie1 {
	public void forLoop() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	
	public void whileLoop() {
		int num = 0;
		while(num < 10) {
			System.out.println(num);
			num++;
		}
	}
	
	public double getRandomIntBetween(int randomNumb) {
		return (Math.random() * randomNumb);
	}
	
	public int loopedSum() {
		int som = 0;
		for(int i = 0; i < 40; i++) {
			som += i;
		}
		return som;
	}
	
	public void sawStringPattern() {
		String zaag = "s";
		for(int i = 0; i <= 4; i++) {
			System.out.println(zaag);
			if(zaag == "ss") {
				zaag = "s";
			} else {
				zaag = "ss";
			}
		}
	}
}
