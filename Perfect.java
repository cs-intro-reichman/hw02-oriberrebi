import java.util.concurrent.ThreadLocalRandom;
class Perfect {
public static void main(String args[]) {

	Integer N = Integer.parseInt(args[0]);
	String s = "";
	int sum = 0;

	for (int i = 1; (i< N); i++) {
		if ((N%i) == 0) {
				sum += i; // #feeedback - note the indentation here.
				s += i; 
				if (i< N/2 && N % i == 0) { // #feedback - note that if we are here then N%i=0, no need to check it again.
					s += " + ";
				}
		}
	}

	if (sum == N) {
		System.out.println(N + " is a perfect number since " + N + " = " + s);
	}
	else {
		System.out.println(N + " is not a perfect number");
	}
	}
}
