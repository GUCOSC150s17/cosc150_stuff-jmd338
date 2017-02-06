
package fibonacci;

import java.io.*;
import org.junit.*;


public class Fib {

	public static void main( String[] args )
	{
		Fib f = new Fib();
		
		for (int i = 1; i < 50; i++ )
		{
			double d = f.getNthFib(i);
			System.out.println("The " + i+ "th Fibonacci number is "+d+".");
		}
	}
	
	
	public long getNthFib( int n )
	{
		long f;
		if (n==1 || n==2)
		{
			f = 1;
		}
		else
		{
			f = getNthFib(n-1) + getNthFib(n-2);
		}
		return f;
	}
	
	
	
	
}
