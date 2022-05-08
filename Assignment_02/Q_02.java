package 

import java.util.*;

public class Main {
	public static void main(String[] args) {
		count obj = new count();
		count obj1 = new count();
		count obj2 = new count();
		count obj3 = new count();
		
		obj.display();
		obj1.display();
		obj2.display();
		obj3.display();
		
		count result = new count();
		result.object();
	}

}

class count
{
	static int total_count = 0;
	
	void display()
	{
		total_count++;
	}
	void object()
	{
		System.out.println("Total number of calls for a member function is " +total_count);
	}
}
