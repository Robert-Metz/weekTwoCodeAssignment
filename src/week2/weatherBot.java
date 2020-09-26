package week2;

import java.util.Scanner;

public class weatherBot {
	
	public static void main(String[] args) {
	
	Scanner user_input = new Scanner(System.in);
	
	//declarations and initializations 
	boolean isHotOutside = true;
	
	boolean isWeekday = false;
	
	
	
	//milk user input
	double costOfMilk;
	System.out.println("What is the cost of milk?");
    costOfMilk = user_input.nextDouble();  
	//money user input
    double moneyInWallet;
	System.out.println("How much money is in your wallet?");
	moneyInWallet = user_input.nextDouble();
	//thirst level
	int thirstLevel;
	System.out.println("What is your thirst level? (1-10)");
	thirstLevel = user_input.nextInt();
	
	boolean hasMoneyInPocket = (moneyInWallet > 0);
	
	boolean shouldBuyIcecream = (isHotOutside && hasMoneyInPocket);
	System.out.println(shouldBuyIcecream);
	boolean willGoSwimming = (isHotOutside && !isWeekday);
	System.out.println(willGoSwimming);
	boolean isAGoodDay = (isHotOutside && !isWeekday && hasMoneyInPocket);
	System.out.println(isAGoodDay);
	boolean willBuyMilk = (isHotOutside && (thirstLevel >= 3) && (moneyInWallet>= (2 * costOfMilk)));
	System.out.println(willBuyMilk);
	}	
}