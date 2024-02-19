public class Search2Dmatrix74 {
    public int Solution(int[][] s,int target){
        int low=0;
        int mid_arr=0;
        if(s.length%2==0){
            mid_arr=s.length/2;
        }else{
            mid_arr=(s.length/2)+1;
        }

        return mid_arr;
    }
}
