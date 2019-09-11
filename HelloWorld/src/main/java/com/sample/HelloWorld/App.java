package com.sample.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
	// Sum of two numbers
	public int sum(int a, int b)
	{
		return a+b;
	}
	
    public static void main( String[] args )
    {
    	// Hello World 
    	//Added one more comment
        System.out.println( "Hello World!" );
        App app = new App();
        int val = app.sum(10, 20);
        System.out.println("value is" +val);
    }
}
