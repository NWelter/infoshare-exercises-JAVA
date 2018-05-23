package oop;

public class GettersAndSetter {

	
	/*  GETTERS AND SETTERS:
	 * 
	 * They are methods which have access to private variables 
	 * (see private double num1, num2;) 
	 * and can get/set(change) a value of method.
	 * 
	 * Nomenclature:
	 * 1. getters methods start with 'get', they're THE SAME TYPE as variables.
	 * 2. setters method start with 'set', they're void types with parameter value.
	 */
	
	private double num1,num2;
	
	//getters and setters MUST BE PUBLIC. 
	
	
	public double getNum1() {
		return num1;
	}
	
	public double getNum2 () {
		return num2;
	}
	
	public void setNum1 (double a) {
		
		num1 = a;
				
	}
	
	/*
	 * We can use 'a' cause it's an only local method's variable.
	 * Parameter value must be the same type as in class field.
	 */
	
	public void setNum2 (double a) {
		
		num2 = a;
	}

}
