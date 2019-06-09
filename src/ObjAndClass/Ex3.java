package ObjAndClass;

public class Ex3 {

	
	int age;
	String name;
	
	public Ex3(int a,String n)
	{
		age=a;
		name=n;
	}
	
	public void displayInfo()
	{
		System.out.println("Age "+age);
		System.out.println("Name "+name);
	}
	
	public static void main(String[] args) {
		
		
		
		Ex3 e1=new Ex3(23,"Ram");
		Ex3 e2=new Ex3(34,"Hitx");
		
		e1.displayInfo();
		e2.displayInfo();
		
		
		
	}
	
}
