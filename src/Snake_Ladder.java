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
	
	//Array declaration.
	static int arrayGame[]=new int[100];
	
	static Random r=new Random();
	public static void main(String[] args)
	{
		
		System.out.println("Lets play snake and ladder game ");
		System.out.println("The player roll the die");
		int random=r.nextInt(6);
		int played=random+1;
		System.out.println("Outcome of die is : "+played);
		int i=0;
			int randomCheck=r.nextInt(3);
			if(randomCheck == noPlay)
			{
				System.out.println("Player stay in the same position");
			}
			else if(randomCheck == ladder)
			{
				i=i+played;
				count1++;
				System.out.println(i);
				System.out.println("ladder "+count1);
			}
			else if(randomCheck == snake)
			{
				i=i-played;
				count2++;
				System.out.println("Snake "+count2);
				if(i < 0)
				{
					position=0;
					System.out.println(position);
				}
				else
				{
					System.out.println(i);
				}
				
				
				
			}
			
		
	}
		
		
}
