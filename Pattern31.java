public class Pattern31
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				if(i%2 == 0)
				{
					System.out.print(j+" ");
				}
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}
