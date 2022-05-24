public class ArithmeticMeanTwo {
	public static void main(String[] args) {
		
		if ( args.length!=2 ) {
			System.out.println("Syntax: ArithmeticMeanTwo <Number 1> <Number 2>");

		} else {
			System.out.println("Arithmetic mean: " + (Float.valueOf(args[0]).floatValue() + Float.valueOf(args[1]).floatValue())/2 );
		}
		
	}
}

	