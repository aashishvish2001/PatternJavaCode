public class Pattern20
{
	public static void main(String[] args)
	{
		int n = 5;
		char ch = 'A';
		for(int i = 1; i <= n; i++)
		{
			ch = 'A';
			for(int j = 1; j <= n; j++)
			{
				if(i%2 == 0)
				{
					System.out.print(ch+" ");
					ch++;
				}
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
