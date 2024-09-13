public class Pattern13
{
	public static void main(String[] args)
	{
		int startNumber = 5;
		for(int i = 1; i <= 5; i++)
		{
			int currentNumber = startNumber;
			for(int j = 1; j <= 5; j++)
			{
				System.out.print(currentNumber);
				currentNumber--;
			}
			System.out.println();
			startNumber ++;
		}
	}
}

		