package Calculator;

/* 
 * Defining Class with functionality
 */
public class SimpleCalculator {
	/*
	 * Multiplication of two numbers
	 * multiplicand : First parameter : Float
	 * multiplier : Second parameter : Float
	 * return : Float
	 */
	public static float multiplyTwoNo(float multiplicand, float multiplier) {
		return multiplicand * multiplier;
	}

	/*
	 * Division of two numbers
	 * divisor : First parameter : Float
	 * dividend : Second parameter : Float
	 * return : Float
	 */
	public static float divideTwoNo(float divisor, float dividend) {
		if(divisor==0){
	        throw new IllegalArgumentException("Divisor can not be possible");
	    }
		return dividend / divisor;
	}

	/*
	 * Addition of two numbers
	 * firstNo : Float
	 * secondNo : Float
	 * return : Float
	 */
	public static float addTwoNo(float firstNo, float secondNo) {
		return firstNo + secondNo;
	}
}