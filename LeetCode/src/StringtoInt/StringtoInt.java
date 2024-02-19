package StringtoInt;

public class StringtoInt {
    public int anInt(String x) {
        int i = 0;
        StringBuffer s = new StringBuffer();


        while (x.charAt(i) == ' ') {
            i++;
        }
        while (i < x.length()) {
            if ((x.charAt(i) > 0 && !(x.charAt(i) >= 'a') && !(x.charAt(i) == '.')) || (x.charAt(i) == '+') || (x.charAt(i) == '-')) {
                s.append(x.charAt(i));
                i++;
            } else break;
            }

        if(s.toString().isEmpty()){
            return 0;
        }
        if (s.charAt(1) == '+' || s.charAt(1) == '-') {
            return 0;
        }

        try {
            int value= Integer.parseInt(s.toString());
            return value;
        }catch(IllegalArgumentException e) {
            if (Long.parseLong(s.toString()) > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (Long.parseLong(s.toString()) < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        int value= Integer.parseInt(s.toString());
        return value;
    }
    public static void main(String[] args){
        String x="4193 is the word";
        StringtoInt obj=new StringtoInt();
        System.out.println(obj.anInt(x));
    }
}