package Assignment_02;

import java.util.*;

public class Q_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int x = s.nextInt();
		
		testClass obj = new testClass();
		
		obj.display(x);
		
	}

}


interface i1{
	void display(int x);
}

class testClass implements i1{

	
	public void display(int x) {
		int count = 0;
		
		
		for(int i = 2; i < x/2; i++) {
			if(x==0||x == 1) {
				System.out.println("Number is not Prime");
			}
			if(x%i == 0)
			{
				System.out.println("Number is not Prime");
				count = 1;
				break;
			}
			if(count == 0){
				System.out.println("Number is Prime");
				break;
			}
		}
		
		
	}
	
}
