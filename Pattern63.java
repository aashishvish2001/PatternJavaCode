class Pattern63
{
	public static void main(String[] args)
	{
		int n = 4;
		int i,j;
		currentNumber = 1;
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print(currentNumber+" ");
				currentNumber--;
			}
			System.out.println();
			currentNumber += 2;
		}
	}
}
