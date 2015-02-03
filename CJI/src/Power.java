
public class Power
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				int result, e;
				for(int i=0; i<10; i++)
					{
						e = i;
						result = 1;
						while(e > 0)
							{
								result *= 2;
								e--;
								System.out.println("e is " + e + " result is " + result);
								
							}
						System.out.println("2 to the power " + i + " is " + 
											result);
						
					}

			}

	}
