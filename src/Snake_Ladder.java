import java.util.*;
public class Snake_Ladder 
{
	//Constant variables.
	static int noPlay=0;
	static int ladder=1;
	static int snake=2;
	
	//Variables.
	static int count1=0;
	static int count2=0;
	static int position=0;
	static int positionForPlayer1=0;
	static int positionForPlayer2=0;
	static int dieCountForPlayer1=0;
	static int dieCountForPlayer2=0;
	static int recentPosition=0;
	
	
	//Getting dice value.
	public static int getDice()
	{
		int random=r.nextInt(6);
		int played=random+1;
		return played;
	}
	
	//Random object to generate random value.
	static Random r=new Random();

	
	public static void main(String[] args)
	{
		System.out.println("Lets play snake and ladder game ");
		System.out.println("The player roll the die");
		//Repeating the loop till position is not reaching to hundred.
		while(true)
		{
			if(positionForPlayer1 < 100 && positionForPlayer2 < 100)
			{
				dieCountForPlayer1++;
				positionForPlayer1=playSnakeAndLadderGame(positionForPlayer1);
				dieCountForPlayer2++;
				positionForPlayer2=playSnakeAndLadderGame(positionForPlayer2);
			}
			else
			{
				break;
			}
			
		}
		if(positionForPlayer1==100)
		{
			System.out.println("Player 1 won.... you rolled the die for"+dieCountForPlayer1+"times");
		}
		else
		{
			System.out.println("Player 2 won.... you rolled the die for"+dieCountForPlayer2+"times");
		}
	}

	private static int playSnakeAndLadderGame(int position) 
	{
		
		int tempPosition=position;
		int play=getDice();
		System.out.println("Dice value come is : "+play);

		//generating random value for an option.
		int randomCheck=r.nextInt(3);
		
		//checking for an option.
		switch(randomCheck)
		{
		
		case 0:
			{
				recentPosition=position;
				System.out.println("Player stay in the same position");
				break;
			}	
			
		case 1:
			{	
				if( (tempPosition+play) > 100)
				{
					position=tempPosition;
					recentPosition=position;
				}
				else
				{
					tempPosition=tempPosition+play;
					recentPosition=tempPosition;
					System.out.println("Ladder come and update postion is : "+tempPosition);
				}
				break;
			}
		case 2: 	
			{
				if( (tempPosition-play) < 0)
				{
					tempPosition=0;
					recentPosition=tempPosition;
					System.out.println("Position is from start : "+tempPosition);
					
				}
				else
				{
					tempPosition=tempPosition-play;
					recentPosition=tempPosition;
					System.out.println("Snake come and update position is : "+tempPosition);
				}
				break;
			}
			
		}	
		return recentPosition;
		
	}
}		
	
