package assignmentGL.Stocks.Arranging;

public class StockInAscending {
	
	public StockInAscending() {
		
	}
	
	static int length;
	
	public static void asceArray(float[] priceOfStocks)
    {
        float temporary = 0;
        length = priceOfStocks.length;
        for (int i = 0; i < length; i++)
        {
            for (int j = i + 1; j < length; j++)
            {
                if (priceOfStocks[i] > priceOfStocks[j])
                {
                    temporary = priceOfStocks[i];
                    priceOfStocks[i] = priceOfStocks[j];
                    priceOfStocks[j] = temporary;
                }
            }
        }
  
        System.out.println("Stock prices in ascending order are : ");
        printArray(priceOfStocks);
    }	

    public static void printArray(float[] priceOfStocks)
    {
        for (int i = 0; i < length; i++) 
        {
            System.out.print(priceOfStocks[i] + " ");
        }
        System.out.println("\n");
    }
  
}
