package ObjAndClass;

public class Ex2 {

	int age;
	String name;
	
	
	public void setVariable(int age,String name)
	{
		this.age=age;
		this.name=name;
		
		System.out.println(age+" "+name);
		
	}
	
	public static void main(String[] args) {
		
		
		Ex2 e1=new Ex2();
		e1.setVariable(12, "Ram");
		e1.setVariable(34, "Yuva");
		
		
		
		
		
	}
	
}
