public class Pattern34
{
	public static void main(String[] args)
	{
		int n = 5;
		char ch = 'A';
		for(int i = 1; i <= n; i++)
		{
			char currentch = ch;
			for(int j = 1; j <= i; j++)
			{
				System.out.print(currentch+" ");
				currentch--;
			}
			System.out.println();
			ch += 2;
		}
	}
}
