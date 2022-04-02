package Unit_01;

public class P2_Task02_ConstantsInJava {

	public static void main(String[] args) {
		//Syntax error on token "double", invalid VariableDeclaratorId
		//int double = 12;
		
		
		//correct VariableDeclaratorId
		int a = 10;
		System.out.println(a);
		
		a=11;
		System.out.println(a);
		
		
		/*  	//Syntax error on token "new", Identifier expected
		 
		   int new(){
			
			  System.out.println("Hello");
			
			  return 0;
		}     
		
		// correct  declaration
		int abc(){
			
			System.out.println("Hello");
			
			return 0;
		}
		
			*/
		
		
		//Syntax error on token "int", invalid VariableDeclaratorId
		//ABC int = new ABC();
		
		
		//Correct Declaration
		Zxc obj = new Zxc();
		
		

	}

}

	/*     //Syntax error on token "int", Identifier expected
	class int{

		void display() {
			System.out.println("In class One .......");
		}
	}     */

	//correct syntax
	 class Zxc{
		
		int c;
		 void display() {
			 
			System.out.println("In class Two.......");
		}
	}
