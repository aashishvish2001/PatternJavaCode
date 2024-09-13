public class Pattern21
{
	public static void main(String[] args)
	{
		int n = 5;
		char ch = 'A';
		char chh = 'a';
		for(int i = 1; i <= n; i++)
		{
			ch = 'A';
			chh = 'a';
			for(int j = 1; j <= n; j++)
			{
				if(i%2 == 0)
				{
					System.out.print(chh+" ");
					chh++;
				}
				else
					System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
