import java.util.Arrays;

public class ValidAnagram {
    public boolean validAnagram(String s,String t){
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String a1=String.valueOf(a);
        String b1=String.valueOf(b);
        if(a1.equals(b1)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String s="nagaram";
        String t="anagram";
        ValidAnagram obj=new ValidAnagram();
        System.out.println(obj.validAnagram(s,t));
    }
}
