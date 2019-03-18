package Calculator;

import java.util.*;
/* 
 * Defining Class with functionality
 */
public class ConstructionCostCalculator {
	static Map<String, Double> constMaterialCost = new HashMap<>(); 
	ConstructionCostCalculator(){
		constMaterialCost.put("STANDARD",1000.0);
		constMaterialCost.put("ABOVE STANDARD",1500.0);
		constMaterialCost.put("HIGH STANDARD",1800.0);
		constMaterialCost.put("HIGH STANDARD AUTOMATED",2500.0);
	}
	/*
	 * Total Construction Cost
	 * ConstMaterial : First parameter : String
	 * totslArea : Second parameter : Double
	 * return : Double
	 */
	public static double compoundInterest(String constMaterial, double totslArea) throws Exception {
		if(!constMaterialCost.containsValue(constMaterial)){
			throw new Exception("Material don't exist");			
		}		
		return constMaterialCost.get(constMaterial) * totslArea;

	}

}