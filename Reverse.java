import java.util.concurrent.ThreadLocalRandom;

class Reverse {
public static void main(String args[]) {

String input_arg = (args[0]); // #feedback - should be inputArg. Also the vaiable below should be argLen.
int arg_len = (input_arg.length() - 1);

while (arg_len >= 0){
	System.out.print(input_arg.charAt(arg_len));
		arg_len = arg_len - 1;	
}

char middle;
// #feedback - Use of "if" is unnecessary here. ((input_arg.length()-1) / 2) will give the middle character in both scenarios.
if (input_arg.length()%2 == 0) {
	middle = input_arg.charAt((input_arg.length()-1)/2);;
}
else {
	middle = input_arg.charAt(input_arg.length()/2);
} 

System.out.println();
System.out.println("The middle character is " + middle);

}
}
