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
		while(position < 100)
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
					System.out.println("Player stay in the same position");
					break;
				}					
			case 1:
				{	
					if( (position+play) > 100)
					{
						position=tempPosition;		
					}
					else
					{
						position=position+play;
					}
					count1++;
					System.out.println("Ladder come and update postion is : "+position);
					break;
				}
			case 2: 	
				{
					if( (position-play) < 0)
					{
						position=0;
						System.out.println("Position is from start : "+position);
						
					}
					else
					{
						position=position-play;
						count2++;
						System.out.println("Snake come and update position is : "+position);
					}
				
					break;
				}	
			
			
		}
	}
}
}