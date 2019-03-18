package Calculator;

/* 
 * Defining Class with functionality
 */
public class InterestCalculator {
	/*
	 * Compound Interest
	 * interestRate : First parameter : Double
	 * principleAmount : Second parameter : Double
	 * year : Third parameter : Double
	 * return : Double
	 */
	public static double compoundInterest(double interestRate, double principleAmount, int year) {
		return principleAmount * Math.pow(year, principleAmount) - principleAmount;
	}

	/*
	 * Simple Interest
	 * interestRate : First parameter : Double
	 * principleAmount : Second parameter : Double
	 * year : Third parameter : Double
	 * return : Double
	 */
	public static double simpleInterest(double interestRate, double principleAmount, int year) {
		return principleAmount * interestRate * year / 100;
	}
}