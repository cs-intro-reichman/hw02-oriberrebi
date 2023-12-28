import java.util.concurrent.ThreadLocalRandom;

class OneOfEach {
public static void main(String args[]) {

	String p = "";
	Integer g = 0;
	Integer b = 0;
	Integer sum = 0;
	Double stat = 0.0;

		while ((g<=0) || (b<=0)) {
			stat = Math.random();
			if (stat>0.5) {
				b++;
				sum++;
				System.out.print("b ");
			}
			else {
				g++;
				sum++;
				System.out.print("g ");
			}
		}

	System.out.println();
	System.out.println("You made it... and you now have " + sum + " children.");
}
}
