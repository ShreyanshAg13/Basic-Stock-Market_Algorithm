package assignmentGL.Driver.Main;

import java.util.Scanner;

import assignmentGL.Stocks.Arranging.StockInAscending;
import assignmentGL.Stocks.Arranging.StockInDescending;
import assignmentGL.Stocks.Counting.StockPriceRose;
import assignmentGL.Stocks.Counting.StockPriceDec;
import assignmentGL.Stocks.Searching.StockSearch;

public class DriverClass {

	public static void main(String[] args)
	{        
		
		int numCompany;  
	    Scanner sc=new Scanner(System.in);  
	    System.out.print("Enter the number of companies: ");  
	 
	    numCompany = sc.nextInt();  
	    
	    float[] priceOfStocks = new float[numCompany];  
	    boolean[] arrayOfBool= new boolean[numCompany];
	    
	    for(int i=0; i<numCompany; i++)  
	    {  
		    System.out.println("Enter current stock price of the company "+(i+1));  
		    priceOfStocks[i]=sc.nextFloat();  
		    System.out.println("Whether company's stock price rose today compare to yesterday?");
		    arrayOfBool[i]=sc.nextBoolean(); 
	    } 
	    
	    for(int j=0; j<=10; j++)
	    {
	    	System.out.println("\n------------------------------------");
		    System.out.print("1. Display the companies stock prices in ascending order\n"
		    		+ "2. Display the companies stock prices in descending order\n"
		    		+ "3. Display the total no of companies for which stock prices rose today\n"
		    		+ "4. Display the total no of companies for which stock prices declined today\n"
		    		+ "5. Search a specific stock price\n"
		    		+ "6. press 0 to exit\n");
		    System.out.println("------------------------------------");
			    
		    int choice =sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					StockInAscending.asceArray(priceOfStocks);
					break;
				case 2:
					
					StockInDescending.descArray(priceOfStocks);
					break;
				case 3:
					StockPriceRose.priceRose(arrayOfBool);
					break;
				case 4:
					StockPriceDec.priceDec(arrayOfBool);
					break;
				case 5:
					StockSearch.searchPrice(priceOfStocks);
					break;
				case 0:
					System.out.print("Exited successfully");
					System.exit(0);
					break;
				default:
					System.out.print("Please choose from the above given numbers only");		
			}
			
	    }

	}
	
}
