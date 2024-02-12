import java.util.ArrayList;
import java.util.Locale;

public class ValidPalindrome {
    public boolean validPali(String s) {
        char[] a = s.toCharArray();
        StringBuilder str = new StringBuilder();
        boolean ans;
        int i = 0;
        while (i < a.length) {
            if ((a[i] >= 'a' && a[i] <= 'z') || (a[i] >= 'A' && a[i] <= 'Z') || (a[i]>='0' && a[i]<='9') ) {
                str.append(a[i]);
                i++;
            }else i++;
        }
        String str1=str.toString().toLowerCase();
        String rev=str.reverse().toString().toLowerCase();

        if(str1.equals(rev)){
             ans=true;
        }else ans=false;
        return ans;
    }
    public static void main(String[] args){
        ValidPalindrome obj=new ValidPalindrome();
        String s="0P";
        System.out.println(obj.validPali(s));
    }
}
