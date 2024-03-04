package Medium;

import java.util.Arrays;

public class BagOfToken948 {
    public int Solution(int[] token,int power){
//        int result=0;
        int score=0;
        int res=0;
        Arrays.sort(token);
        int l=0;
        int r= token.length-1;
        while(l<=r){
            if(power>=token[l]){
                power-=token[l];
                score+=1;
                res=Math.max(score,res);
                l++;
            }else if(score>0){
                power+=token[r];
                r-=1;
                score-=1;
            }else break;
        }return res;
    }
    public static void main(String[] args){
        BagOfToken948 obj=new BagOfToken948();
        int[] arr={200,100};
        System.out.println(obj.Solution(arr,150));
    }
}
