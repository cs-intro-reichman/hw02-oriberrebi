import java.util.concurrent.ThreadLocalRandom;
class InOrderTest {
public static void main(String args[]) {

	Integer number = (int) (Math.random()*10);
	System.out.println(number);

	while (number<10) {
		Integer i = (int) (Math.random()*10);
		if (i>= number) {	
			System.out.println(i);
			number = i;
			}
		else {
			number=10;
		}
	}
}
}
