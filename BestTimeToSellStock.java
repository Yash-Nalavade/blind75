// Works but exceeds time limit - brute force

class Solution {
    public int maxProfit(int[] prices) {

int max = 0, min =0;
        for(int i=0; i<prices.length; i++)
        {
            for(int j=i+1; j<prices.length;j++)
            {
                 if(prices[i]<prices[j] && max<(prices[j] - prices[i]))
                 max = prices[j] - prices[i];

            }
        }

        return max;
        
    }
}



// Approach 2 - keeping a minsofar variable to keep smallest value stored

class Solution {
    public int maxProfit(int[] prices) {

int maxp = 0, minsofar =prices[0], profit =0;
        for(int i=0; i<prices.length; i++)
        {
            minsofar = Math.min(minsofar, prices[i]);
            profit = prices[i]-minsofar;
            maxp = Math.max(maxp,profit);
        }
return maxp;
        
    }
}


// Fastest 
class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}


