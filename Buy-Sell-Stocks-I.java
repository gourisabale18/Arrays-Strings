class Solution {
    public int maxProfit(int[] prices) {
        int minStock=prices[0];
        int maxProfit=0;

        for(int i=1;i<prices.length;i++)
        {
            if(minStock>prices[i])
            {
                minStock=prices[i];
            }
            if(maxProfit<prices[i]-minStock)
            {
                maxProfit=prices[i]-minStock;
            }
        }
        return maxProfit;
       
    }
}