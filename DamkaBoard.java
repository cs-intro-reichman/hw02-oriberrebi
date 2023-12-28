import java.util.concurrent.ThreadLocalRandom;

class DamkaBoard {
public static void main(String args[]) {

	Integer n = Integer.parseInt(args[0]);
	String b = "";

		for (int i = n; (i> 0); i = (i - 1)) {
			for (int j = n; (j> 0); j = (j - 1)) {
				b += "* ";		
			}	

			if (i%2 == 0) {
				System.out.println(" " + b);
				}
		else {
			System.out.println(b);
			}
		
		b = "";
}
}
}
