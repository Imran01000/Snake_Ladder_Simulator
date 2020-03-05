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

	//Random object to generate random value.
	static Random r=new Random();


	//Getting dice value.
	public static int getDice()
	{
		int random=r.nextInt(6);
		int played=random+1;
		return played;
	}

	public static void main(String[] args)
	{
		System.out.println("Lets play snake and ladder game ");
		System.out.println("The player roll the die");
		//Repeating the loop till position is not reaching to hundred.
		while(true)
		{
			if(positionForPlayer1 < 100 && positionForPlayer2 < 100)
			{
				System.out.println("Player1 played");
				positionForPlayer1=playSnakeAndLadderGame(positionForPlayer1);
				dieCountForPlayer1++;
				System.out.println("Player2 played");
				positionForPlayer2=playSnakeAndLadderGame(positionForPlayer2);
				dieCountForPlayer2++;
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
			tempPosition=position;
			System.out.println("Player stay in the same position");
			break;
		}	

		case 1:
		{	
			if( (position+play) > 100)
			{
				tempPosition=position;
			}
			else
			{
				position=position+play;
				tempPosition=position;
				System.out.println("Ladder come and update postion is : "+tempPosition);
			}
			break;
		}
		case 2: 	
		{
			if( (position-play) < 0)
			{
				position=0;
				tempPosition=position;
				System.out.println("Position is from start : "+tempPosition);

			}
			else
			{
				position=position-play;
				tempPosition=position;
				System.out.println("Snake come and update position is : "+tempPosition);
			}
			break;
		}

		}	
		return tempPosition;

	}
}		

