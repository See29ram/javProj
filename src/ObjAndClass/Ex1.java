package ObjAndClass;

public class Ex1 {

	int a;
	String age;
    static String name="Loop";
	public static void main(String[] args) {

		Ex1 e1 = new Ex1();
		e1.a = 1;
		e1.age = "34";
		System.out.println(e1.a);
		System.out.println(e1.age);
		System.out.println(name);
		Ex1 e2=new Ex1();
		//e2.a=2;
		//e2.age="45";
		System.out.println(e2.a);
		System.out.println(e2.age);

	}

}
