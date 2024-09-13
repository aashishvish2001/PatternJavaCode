public class Pattern39
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				if(i <= 1 && j <= 5 || i >= 5 && j <= 9 || i == j || j-i == 4)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
