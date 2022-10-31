import java.util.*;
public class AverageWithoutMain {
	static void average()
	{   int sum=0;
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of inputs:");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("enter the numbers :");
		for (i=0 ; i<=n-1 ;i++)
		{
			a[i]=s.nextInt();
			//sum+=a[i];
		}
		for ( i=0 ; i<=n-1 ;i++)
		{
			
			sum=sum+a[i];
		}
		int avg = (sum/n);
		System.out.println("Average of Number is :"+ avg);
	}
	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		System.out.println("enter a number:");

		int n =s.nextInt();
		boolean primeFlag=true;
		if(n<=1) {
			System.out.println("is not prime");
		}
		for(i=2;i<=n-1;i++)

		{

		if(n%i==0)

		{

		primeFlag=false;}
		}

		if(primeFlag == true)
		{

		System.out.println(n+" is prime");

		}
		else{

		System.out.println(n+"is not prime");


	}
		System.out.println("Default Values:"+a);
		System.out.println("Default Values:"+b);
		System.out.println("Default Values:"+c);
		System.out.println("Default Values:"+d);
		System.out.println("Default Values:"+e);
		average();
		//System.out.println("Average of Number is :"+ avg);
	}

}
