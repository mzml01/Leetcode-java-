package Repeatingprefix;

import java.util.Arrays;

public class RepeatingPrefix2 {
    public String checkPre(String[] str){
        StringBuilder s=new StringBuilder();
        Arrays.sort(str);
        String first=str[0];
        String last=str[str.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return s.toString();
            }
            s.append(first.charAt(i));
        }
        return s.toString();
    }
}

