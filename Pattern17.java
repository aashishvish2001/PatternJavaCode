public class Pattern17
{
	public static void main(String[] args)
	{
		int n = 5;
		char ch = 'F';
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n+1; j++)
			{
				System.out.print((char)(ch - i));
			}
			System.out.println();
		}
	}
}
