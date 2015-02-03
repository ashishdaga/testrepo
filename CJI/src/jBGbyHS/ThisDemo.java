package jBGbyHS;

public class ThisDemo
	{

		public static void main(String[] args)
			{
				ThisClass x = new ThisClass(2, 4.0);
				ThisClass y = new ThisClass(1, 2.5);
				ThisClass z = new ThisClass(0, 5.7);
				
				System.out.println(x.b + " raised to " + 
									x.e + " power is " +
									x.get_pwr());
				
				System.out.println(y.b + " raised to " + 
									y.e + " power is " +
									y.get_pwr());
				
				System.out.println(z.b + " raised to " + 
									z.e + " power is " +
									z.get_pwr());
				

			}

	}

class ThisClass
{
	int e;
	double b;
	double val;
	
	ThisClass(int exp, double base)
	{
		this.b = base;
		this.e = exp;
		
		this.val = 1;
		if(exp == 0) return;
		for( ; exp>0; exp--)
			{
				this.val = this.val * base;
				
			}
		
	}
	
	double get_pwr()
	{
		return this.val;
		
	}
}