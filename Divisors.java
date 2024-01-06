import java.util.concurrent.ThreadLocalRandom;

class Divisors {
public static void main(String args[]) {
Integer input_number = Integer.parseInt(args[0]); // #feedback - the convention in Java is to use CamelCase for vairable name, so here it should be inputNumber.

for (int i = 1; (i<= input_number); i++) {
	if ((input_number%i) == 0) {
			System.out.println(i);
	}
}
}
}
