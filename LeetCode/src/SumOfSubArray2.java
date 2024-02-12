import java.util.ArrayList;

public class SumOfSubArray2 {

    public ArrayList<Integer> subArraySum(int[] arr, int n, int sum) {
        ArrayList<Integer> result = new ArrayList<>();

        int currentSum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

            while (currentSum > sum && start < end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == sum) {
                result.add(start + 1);  // Adding 1 to convert to 1-based index
                result.add(end + 1);    // Adding 1 to convert to 1-based index
                break;  // You mentioned breaking when the sum is found, so break out of the loop
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SumOfSubArray2 obj = new SumOfSubArray2();
        int[] arr = {1,2,7,4,5};
        int n = arr.length;
        int sum = 13;

        ArrayList<Integer> result = obj.subArraySum(arr, n, sum);
        System.out.println(result);
    }
}
