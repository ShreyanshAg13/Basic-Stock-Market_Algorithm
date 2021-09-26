package assignmentGL.Stocks.Searching;

import java.util.Scanner;

public class StockSearch {
	
	public StockSearch() {
		
	}

	public static void searchPrice(float[] priceOfStocks)
	{
		
		int length = priceOfStocks.length;
		int i, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the key value");
	 	float search = sc.nextFloat();		
		for(i = 0; i < length; i++)
	    {
	        if(priceOfStocks[i] == search)
	        {
	            System.out.println("Stock of value " + search + " is present \n");
	            flag = 1;
	            break;
	        }
	    }
	    if(flag == 0)
	    {
	        System.out.println("Value not found \n");
	    }
	}
	
}
