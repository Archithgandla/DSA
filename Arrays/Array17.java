
//Best time to but stock

/*Not working for few test cases

class Solution {
    
    public int maxProfit(int[] prices) {
        
        int min = 0;
        int max = 1;
        int i;
        for(i=0;i<prices.length;i++){
            
            if(prices[i]<=prices[min]){
                min = i;
                System.out.println("min : "+i);
            }
            
            if(i>min && prices[i]>=prices[max]){
                max = i;
                System.out.println("max : "+i);
            }
            
        }
        
        if(min == prices.length-1)
            return 0;
        
        return prices[max]-prices[min];
    }
}
*/




class Array17 {
    
    public static int maxProfit(int[] prices) {
        
        int buy = prices[0],profit = 0;
        
        for(int i = 1;i<prices.length;i++){
            
            if(prices[i]<buy)
                buy  = prices[i];
            
            profit = Math.max(prices[i]-buy,profit);
            //profit = Math.max(,0);
                        
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
