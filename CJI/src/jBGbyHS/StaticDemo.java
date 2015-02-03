package jBGbyHS;

public class StaticDemo
	{

		public static void main(String[] args)
			{
				StaticTest ob1 = new StaticTest();
				StaticTest ob2 = new StaticTest();
				
				ob1.x = 10;
				ob2.x = 20;
				//ob1.y = 100;
				StaticTest.y = 200;
				
				System.out.printf("Object 1 - x : %d", ob1.x);
				System.out.println();
				System.out.printf("Object 2 - x : %d", ob2.x);
				System.out.println();
				System.out.printf("Value of y : %d", StaticTest.y);

				

			}

	}

class StaticTest
{
	int x;
	static int y;
	
	//Return the sum of x and y
	public int sum()
	{
		return x + y;
		
	}
}
