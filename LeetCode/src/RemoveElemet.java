public class RemoveElemet {
    public int removeElements(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args){
        RemoveElemet obj=new RemoveElemet();
        int[] num={2,2,3,2};
        int val=2;
        System.out.println(obj.removeElements(num, val));
    }
}
