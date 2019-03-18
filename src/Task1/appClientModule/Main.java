import static org.junit.Assert.*;

import org.junit.Test;
import Calculator.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}
	
	@Test
    public void SimpleCalculatorTest() {
        assertEquals("error in divideTwoNo()",0.5,SimpleCalculator.divideTwoNo(-1,-2),0);
        assertEquals("error in addTwoNo()",9,SimpleCalculator.addTwoNo(9,0),0);
		assertEquals("error in multiplyTwoNo()",2,SimpleCalculator.multiplyTwoNo(1,2),0);
	}
    public void InterestCalculatorTest() {
        assertEquals("error in compoundInterest()",0.5,InterestCalculator.compoundInterest(2, 200, 5),0);
        assertEquals("error in simpleInterest()",0.5,InterestCalculator.simpleInterest(2, 200, 5),0);
	}
    public void ConstructionCostCalculatorTest() throws Exception {
        assertEquals("error in compoundInterest()",0.5,ConstructionCostCalculator.compoundInterest("STANDARD", 1000),0);
	}
}