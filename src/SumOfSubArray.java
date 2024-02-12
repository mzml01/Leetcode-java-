import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfSubArray {
    public ArrayList<Integer> subArraySum(int[] arr,int n,int sum){
        ArrayList<Integer> a=new ArrayList<>();
        for(int x: arr){
            a.add(x);
        }
        ArrayList<Integer> b=new ArrayList<>(a.size());
        ArrayList<Integer> c=new ArrayList<>();
        int s=0;
        for(int i=0;i<a.size();i++){
            if(s==sum){
                break;
            }
                 s-=s;
                 s+=a.get(i);
            for(int j=i+1;j<a.size();j++){

                if((s+a.get(j))==sum && s<sum){
                     c.add(i+1);
                     c.add(j+1);
                     s+=a.get(j);
                     break;
                }else {
                    s+=a.get(j);
                }
            }
        }
//        Collections.sort(c);
        return c;
    }
    public static void main(String[] args){
        SumOfSubArray obj=new SumOfSubArray();
        int[] arr={1,2,8,7,5};
        int n=arr.length;
        int sum=12;
        System.out.println(obj.subArraySum(arr,n,sum));
    }
}
