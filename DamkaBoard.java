class DamkaBoard {
public static void main(String args[]) {

	Integer n = Integer.parseInt(args[0]);
	String b = "";

		for (int i = n; (i> 0); i = (i - 1)) { // #feedback - you can use i--. Also, the parenthesis in (i>0) are not needed.
			for (int j = n; (j> 0); j = (j - 1)) {
				if (n%2 == 0){ // #feedback - this "if" is not needed.
					if (i%2 == 0){
						b += "* ";
					}
					else {
						b += " *";
					}
                }
                else {
                    if (i%2 == 0){
						b += " *";
					}
					else {
						b += "* ";
					}
                }
			}	


		System.out.println(b);
		b = ""; // #feedback - this is not needed, you are already done with the function in this step.
}
}
}
