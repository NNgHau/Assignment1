// Ngoc Hau Nguyen
// Professor Kevin
//JAVA
// 1/23/2022

import java.text.DecimalFormat;
import java.util.*;
public class Hau_Assignment1 {
	
	private static final DecimalFormat decimalFormat = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		int count = 0;

		while (count++ < 10) 

		{ 

		   System.out.println("Welcome to Java");

		}
		
		System.out.println("Welcome to the Stock Picker App!\r\n");
		System.out.print("Enter the total amount of money you are willing to invest : ");
		
		Scanner sc= new Scanner(System.in);   
		double total_money= sc.nextDouble(); 

		
		System.out.print("Enter the stock ticker: ");
		sc.nextLine();
		String ticker= sc.nextLine();
		
		while(ticker.length()>5) {
			System.out.println("Invalid input. Try again.");
			System.out.print("Enter the stock ticker: ");
			ticker =sc.nextLine();
		}
		

	
		System.out.print("Enter the price: ");
		double price= sc.nextDouble();
		
		while(price<=0) {
			System.out.println("Invalid input. Try again.");
			System.out.print("Enter the price: ");
			price= sc.nextDouble();
		}

		System.out.print("Enter the P/E Ratio: ");
		double peRatio= sc.nextDouble();
		
		
		int numberOFshare= (int) (total_money / price); 
		System.out.println();
		System.out.println("Below are your results:");
		System.out.println();
		String stockResult = String.format("Stock: %s", ticker);
		System.out.println(stockResult);
		

		String priceResult = String.format("Price: $%s", decimalFormat.format(price)); 
		System.out.println(priceResult);
		
		String pricepeRatio = String.format("P/E Ratio: %s", decimalFormat.format(peRatio));
		System.out.println(pricepeRatio);
		if (peRatio>60) {
			System.out.println("WARNING: This company may be overvalued!");
			
		}
		String result = String.format("# of shares able to purchase: %s", numberOFshare);
		System.out.println(result);
		
		
	}
}