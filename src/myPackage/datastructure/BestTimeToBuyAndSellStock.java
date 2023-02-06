package myPackage.datastructure;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices){
        int maxSoFar = Integer.MIN_VALUE;
        int buy = 0,sell=0;

        for(int i=0; i< prices.length ;i++){
            buy = prices[i];
            for(int j = i; j<prices.length ;j++){
                sell = prices[j];
                if((sell-buy)>maxSoFar){
                    maxSoFar = sell-buy;
                }else if(sell-buy < 0){

                }
            }
        }
        return maxSoFar;
    }

    public static int maxProfitOptimized(int[] prices){
        int start = 0;
        int len = prices.length;
        int maxIdx = maxIdx(prices,start,len);
        int minIdx = minIdx(prices,start,len);
        if(maxIdx > minIdx){
            return prices[maxIdx] - prices[minIdx];
        }else if(maxIdx < minIdx && minIdx+1 < len && maxIdx <len) {
            int nextMax = maxIdx(prices,minIdx+1,len);
            if(prices[nextMax] > prices[minIdx]){
                return prices[nextMax] - prices[minIdx];
            }else return 0;
        }

        return 0;
    }

    public static int maxIdx(int[] prices, int start, int length){
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        for(int i = start; i< length;i++){
            if(prices[i] > max){
                max = prices[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static int minIdx(int[] prices, int start, int length){
        int min = Integer.MAX_VALUE ;
        int minIdx = -1;
        for(int i = start; i< length;i++){
            if(prices[i] < min){
                min = prices[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static void main(String[] args) {
        int[] prices = {2,4,1};
        System.out.println(maxProfitOptimized(prices));
    }
}
