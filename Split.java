public class Split {

public static void main(String[] args){
	split(args[0], Integer.parseInt(args[1]));
}

public static void split(String input, int divisor) {
	int arrayLength = input.length() / divisor;
	if (input.length() % divisor != 0) arrayLength++;
	String[] output = new String[arrayLength];
	int j = 0;
	for (int i = 0; j < arrayLength; i += divisor, j++) {
		if (j == arrayLength - 1) output[j] = input.substring(i, input.length());
		else output[j] = input.substring(i, i+divisor);
	}
	for (int i = 0; i < output.length; i++){
		System.out.println(output[i]);
	}
}

}