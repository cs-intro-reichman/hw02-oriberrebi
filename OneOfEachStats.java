import java.util.Random;

class OneOfEachStats {
public static void main(String args[]) {

	Integer t = Integer.parseInt(args[0]);
	Integer seed = Integer.parseInt(args[1]);
	Integer two_k = 0;
	Integer three_k = 0;
	Integer four_k = 0;
	Double sum = 0.0;

	Random random = new Random(seed);

	for (int i = t; (i> 0); i = (i - 1)) {

		String p = "";
		Integer g = 0;
		Integer b = 0;
		Double stat = 0.0;
		sum = 0.0;

			while ((g<=0) || (b<=0)) {
				stat = random.nextDouble();
				if (stat>0.5) {
					b++;
					sum++;
				}
				else {
					g++;
					sum++;
				}
			}

		Integer sum2 = (int) sum.doubleValue();

		switch (sum2) {
			case 2: two_k++;
				break;
			case 3: three_k++;
				break;
			default: four_k++;
				break;
		}
		}

	Integer common = 0;

		if ((two_k> three_k) && (two_k> four_k)) {
			common = 2;
		}
		else {
			if (three_k> four_k) {
				common = 3;
			}
			else {
				common = 4;
			}
		}

		Integer fSum = ((two_k*2) + (three_k*3) + (four_k*4));
		Double dSum = (double) fSum;
		Double tt = (double) t;
		Double avg = (fSum/tt);

		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two_k);
		System.out.println("Number of families with 3 children: " + three_k);
		System.out.println("Number of families with 4 children: " + four_k);
		System.out.println("The most common number of children is " + common + ".");

}
}

