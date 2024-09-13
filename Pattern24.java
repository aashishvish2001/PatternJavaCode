public class Pattern24
{
	public static void main(String[] args)
	{
		int count = 0;
		for(int i = 0; i <= 4; i++)
		{
			count = i;
			for(int j = 0; j <= i; j++)
			{
				count = count+1;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
}
