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
	
	static Random r=new Random();
	public static void main(String[] args)
	{
		
		System.out.println("Lets play snake and ladder game ");
		System.out.println("The player roll the die");
		while(position < 100)
		{		
			int random=r.nextInt(6);
			int played=random+1;
			System.out.println("Dice value come is : "+played);
			int randomCheck=r.nextInt(3);
			if(randomCheck == noPlay)
			{
				System.out.println("Player stay in the same position");
			}
			else if(randomCheck == ladder)
			{
				position=position+played;
				count1++;
				System.out.println("Ladder come and update postion is : "+position);
			}
			else if(randomCheck == snake)
			{
				position=position-played;
				count2++;
				if(position < 0)
				{
					position=0;
					System.out.println("Position is from start : "+position);
				}
				else
				{
					System.out.println("Snake come and update position is : "+position);
				}
				
			}	
				
		}
		System.out.println(count1);
		System.out.println(count2);
		
	}
		
		
}
