import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean Solution(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }return false;
    }public static void main(String[] args){
        ContainsDuplicate obj=new ContainsDuplicate();
        int[] n={1,2,3,4};
        System.out.println(obj.Solution(n));
    }
}

