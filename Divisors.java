import java.util.concurrent.ThreadLocalRandom;

class Divisors {
public static void main(String args[]) {
Integer input_number = Integer.parseInt(args[0]);

for (int i = 1; (i<= input_number); i++) {
	if ((input_number%i) == 0) {
			System.out.println(i);
	}
}
}
}
