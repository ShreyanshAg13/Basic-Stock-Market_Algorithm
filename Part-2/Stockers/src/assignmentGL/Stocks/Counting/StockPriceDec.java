package assignmentGL.Stocks.Counting;

public class StockPriceDec {
	
	public StockPriceDec() {
		
	}

	public static void priceDec(boolean[] arrayOfBool)
	{
	    int count = 0;
	    for (Boolean b : arrayOfBool) 
	    	if (!b) 
	    		count++;
	    System.out.println("Total no of companies whose stock price declined today : "+ count + " \n");
	}
}
