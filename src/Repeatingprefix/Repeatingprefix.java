package Repeatingprefix;
public class Repeatingprefix {
    public String checkPre(String[] str) {
        int len= str.length;
        String prefix=str[0];
        for(int i=1;i<len;i++){
            String s=str[i];
            if(prefix.length()>s.length()){
                String temp=prefix;
                prefix=s;
                s=temp;
            }
            for(int j=0;j<prefix.length();j++){
                if(prefix.charAt(j)!=s.charAt(j)){
                    if(j==0){
                        return "";
                    }
                    prefix=prefix.substring(0,j);
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args){
        Repeatingprefix obj=new Repeatingprefix();
        RepeatingPrefix2 obj2=new RepeatingPrefix2();
        RepeatingPrefix3 obj3=new RepeatingPrefix3();
        String[] strs={"blow","bland","black"};
//        System.out.println(obj.checkPre(strs));
        System.out.println(obj2.checkPre(strs));
//        System.out.println(obj3.longestCommonPrefix(strs));
    }
}
