public class Pattern16
{
	public static void main(String[] args)
	{
		int n = 5;
		char ch = 'A';
		for(int i = n; i <= 1; i++)
		{
			for(int j = 1; j >= n; j--)
			{
				System.out.print((char)(i - 1)+j);
			}
			System.out.println();
		}
	}
}
