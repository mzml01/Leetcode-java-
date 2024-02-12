import java.util.Arrays;

public class RemoveDuplicate {
    public int removeDuplicate(int[] nums){
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
        }

    public static void main(String[] args){
        RemoveDuplicate obj=new RemoveDuplicate();
        int[] num={0,0,1,1,1,2,2,3,3,4};
        System.out.println(obj.removeDuplicate(num));
    }
}
