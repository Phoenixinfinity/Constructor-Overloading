package practical;

public class Student {
	
	String Name;
	int Age;
	String Colour;
	Student()
	{
		Name = "Mitali";
		Age = 19;
		Colour = "Black";
	}
	Student(String str, int num, String abc)
	{
		Name = str;
		Age = num;
		Colour = abc;
	}
	void display()
	{
		System.out.println("Name is  "+Name+".");
		System.out.println("Her Age is "+Age+" years.");
		System.out.println("Her Favourite Colour is "+Colour+".");
		System.out.println("\n");
	}
	public static void main(String[] args)
	{
		Student obj = new Student();
		Student obj1 = new Student("Samriddhi",18,"Pink");
		obj.display();
		obj1.display();
	}
}
