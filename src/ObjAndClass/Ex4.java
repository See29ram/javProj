package ObjAndClass;

public class Ex4 {

 int age;
 String name;
 
 public void setAge(int a)
 {
	 age=a;
 }
 public void setName(String n)
 {
	 name=n;
 }

 public void displayInfo()
 {
	 System.out.println(age);
	 System.out.println(name);
 }
	
	public static void main(String[] args) {
		
		
		
		Ex4 e1=new Ex4();
		e1.setAge(12);
		e1.setName("Hari");
		Ex4 e2=new Ex4();
		e2.setAge(23);
		e2.setName("ARR");
		e1.displayInfo();
       e2.displayInfo();		
		
	}
	
}
