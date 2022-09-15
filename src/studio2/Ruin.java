package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Start amount of money: ");
		double startAmount = in.nextDouble();
		
		System.out.print("Win chance: ");
		double winChance = in.nextDouble();
		
		System.out.print("Win Limit: ");
		double winLimit = in.nextDouble();
		
		System.out.print("Number of Days: ");
		int totalSimulations = in.nextInt();
		
	
		
		for (int x = 1; x < totalSimulations; x++ )
		{	
			double balance = startAmount;
			while (winLimit>balance && balance>0)
			{	
				balance--;
				double y = Math.random();
					if (y<winChance)
					{
						balance = balance+2;
					}
					
		
			}	
		}
		if (startAmount == winLimit)
		{
			System.out.println("Win");
			
		}
		else 
			System.out.println("Lose");
		
	}

}
