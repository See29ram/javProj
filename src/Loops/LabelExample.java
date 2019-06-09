package Loops;

public class LabelExample {

	
	
	public static void main(String[] args) {
		
		
		
		
		for(int a=1;a<=5;a++)
		{
			System.out.println("A "+a);
			System.out.println("B strated");
			bb:
			for(int b=1;b<=8;b++)
			{
				System.out.println("B "+b);
				if (b==2)
				{
				  break bb;
				}
				
			}
			
			
		}
		
		
		
	}
	
	
}
