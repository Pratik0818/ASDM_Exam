
public class Main
{

	public static void main(String[] args)
	{
		
	        System.out.print("Armstrong numbers from 1 to 1000:");
	        for(int i = 1; i <= 1000; i++)
	        {
	           int n=i; 
	           int sum = 0;
	            while(n != 0)
	            {
	               int b = n % 10;
	                sum = sum + (b * b * b);
	               n = n / 10;
	            }
	            if(sum == i)
	            {
	                System.out.print(i+" ");
	            }
	          
	        }
		

	}

}
