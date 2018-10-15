import java.util.Scanner;

public class DiceMain {

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		boolean dub = false;
		boolean stop = false;
		
		while (!dub)
		{
			int roll1 = dice1.roll();
			int roll2 = dice2.roll();
			System.out.println("roll1:" + roll1);
			System.out.println("roll2:" + roll2);
			System.out.println("sum1:" + (roll1 + roll2));
			if (roll1 == roll2) 
			{
				dub = true;
				System.out.println("Total Rolls :" + dice1.numRolls());
			}
		}
		
		dice1.reset();
		dice2.reset();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please put a value between 2 and 12: "); //Display prompt
		int val = in.nextInt();
		in.nextLine();
		while (val < 2 || val > 12) 
		{
			System.out.println("Please put a value between 2 and 12: "); // Display prompt
			val = in.nextInt();
			in.nextLine();
		}
		while (stop == false) 
		{
			int roll1 = dice1.roll();
			int roll2 = dice2.roll();
			System.out.println("roll1:" + roll1);
			System.out.println("roll2:" + roll2);
			System.out.println("sum1:" + (roll1 + roll2));
			if (roll1 + roll2 == val) 
			{
				stop = true ;
			System.out.println("Total Rolls :" + dice1.numRolls());
			}
		}
		
		
		
		
		
	}

}
