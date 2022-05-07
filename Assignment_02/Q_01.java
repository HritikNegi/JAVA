import java.util.*;

class Student
{
	String name;
	int age;
	char section;
	float per; 
	static float total_per = 0.0f;
	
	Student(String name, int age, char section, float per) 
	{
		name = name;
		age = age;
		section = section;
		per =per;
		System.out.println("Name : "+ name +"   "+"Age : " + age +"   " + "Section : "+ section + "   " + "Percentage of student : " + per); 
		System.out.println();
		total_per = total_per + per;
	}
	
	Student(){}
	
	void avg_per()
	{
		float average = total_per / 6f;
		System.out.println("Average percentage of section A is "+average+" %"); 
	}
}

public class Main {
    
	public static void main(String[] args) {
	    
		Student obj1 = new Student("Hritik",20,'A',70.5f);
		
		Student obj2 = new Student("Barat",21,'A',40.0f);
		
		Student obj3 = new Student("Ankit",19,'A',35.8f);
		
		Student obj4 = new Student("Ram",21,'A',60.2f);
		
		Student obj5 = new Student("Astha",20,'A',88.9f);
		
		Student obj6 = new Student("Soniya",19,'A',90.5f);
		 
		 
		Student result = new Student();
		result.avg_per();
	
	}

}

