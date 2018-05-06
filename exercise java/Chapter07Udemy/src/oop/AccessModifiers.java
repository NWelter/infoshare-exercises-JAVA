package oop;

public class AccessModifiers {
	
//STRUCTURE OF CLASS:
	
// I. CONTRUCTORS:
	
	//default constructor (must be public):
	
		public AccessModifiers() {
			
		}

		//create another constructor (with initialize values) - the same name:
		
		public AccessModifiers(int a, int b, int c) {
			
			this.noSpec = a;
			this.privSpec = b;
			this.protSpec = c;
	
		}
// II. VARIABLES:
	
	//differences between access modifiers
	
	//ALL OF them variables are INSTANCE VARIABLES
	
	int noSpec; // visible for all classes in this package (oop)
	
	public int pubSpec; //visible for ALL Java classes, uses often for method,
	
	protected int protSpec; //visible ONLY in this class (AccessModifiers)
	
	private int privSpec; //visible in this classes and subclasses, uses often for variables,
	
// III. METHODS:
	
		/*
	 	Declare a method - a structure:
	 	
	 	access modifier:			return type:			name method:	(list of parameters):
	 	
	 	public/private/protected 	int/String/void etc. 	firstLowerCase 	(int, String, double etc.)
	 		{
	 			BODY OF THE METHOD;
	 			(if not void type):
	 			return;
	 		}
		 */
	
	public void displayHello () {
		
		System.out.println("Hello!");
			
	}
	

}
