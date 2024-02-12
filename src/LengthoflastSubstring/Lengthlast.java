package LengthoflastSubstring;

public class Lengthlast {
    public int lastString(String str) {
        int count = 0;

        char[] ch = str.toCharArray();
        int i = ch.length-1;
        while(ch[i]==' '){
            i--;
        }
        for (int j = i; j >= 0; j--) {
            if (ch[j] != 32) {
                count++;
            } else break;
        }
        return count;
    }
    public static void main(String[] args){
        String str="a";
        Lengthlast obj=new Lengthlast();
        System.out.println(obj.lastString(str));

    }
}
