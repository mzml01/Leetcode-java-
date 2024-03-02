import java.util.Arrays;

public class SquaresOfSortedArray977 {
    public int[] Solution(int[] arr){
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)Math.pow(arr[i],2);
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args){
        int[] arr={-4,-1,0,3,10};
        SquaresOfSortedArray977 obj=new SquaresOfSortedArray977();
        for(int i : obj.Solution(arr)){
            System.out.println(i);
        }
    }
}
