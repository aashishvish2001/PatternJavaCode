public class Pattern25
{
	public static void main(String[] args)
	{
		int startNumber = 1;
		for(int i = 1; i <= 5; i++)
		{
			int currentNumber = startNumber;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(currentNumber);
				currentNumber--;
			}
			System.out.println();
			startNumber += 2;
		}
	}
}
	
				