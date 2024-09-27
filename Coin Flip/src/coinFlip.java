import java.util.Scanner;

public class coinFlip
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner (System.in);
				
				System.out.println("Welcome! How many times do you want to flip this coin?");
				int flipCoin = userInput.nextInt();
				
				int heads = 0;
				int tails = 0;
				
				
				for(int i = 0; i < flipCoin; i++)
					{
						int coinFlip = (int)(Math.random() * 2);
						
						if(coinFlip == 0)
							{
								heads++;
							
							}
						if(coinFlip == 1)
							{
								tails++;
							}
					}
				
				if((heads>1||heads==0) && (tails>1||tails==0)) 
					{
						System.out.println("You got " + heads + " heads and " + tails + " tails.");
				    }
				
				else if(heads == 1 && tails == 1 )
					{
						System.out.println("You got " + heads + " head and " + tails + " tail.");
					}
				
				else if(heads == 1 && (tails>1||tails==0))
					{
						System.out.println("You got " + heads + " head and " + tails + " tails.");
					}
				
				else if((heads>1||heads==0) && tails == 1)
					{
						System.out.println("You got " + heads + " heads and " + tails + " tail.");
					}

			}

	}
