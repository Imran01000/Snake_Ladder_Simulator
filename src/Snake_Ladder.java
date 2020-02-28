import java.util.*;
public class Snake_Ladder 
{
	public static void main(String[] args)
	{
		Random r=new Random();
		System.out.println("Lets play snake and ladder game ");
		System.out.println("The player roll the die");
		int random=r.nextInt(6);
		int played=random+1;
		System.out.println("Outcome of die is : "+played);
	
		
	}
		
		
}
