public class BestTimeToBuyAndSellStocks {
    public static int Solutuion(int[] prices){
        int left=0;
        int right=1;
        int max=0;
        while(right<prices.length){
            if (prices[right] > prices[left]) {
                max=Math.max(max,prices[right]-prices[left]);
            }else{
                left=right;
            }
            right++;
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={7,1,5,3,6,4};
        System.out.println(Solutuion(arr));

    }
}
