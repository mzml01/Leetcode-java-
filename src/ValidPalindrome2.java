public class ValidPalindrome2 {
    public boolean validPalindrome(String s){
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        ValidPalindrome2 obj=new ValidPalindrome2();
        String s="A man, a plan, a canal: Panama";
        System.out.println(obj.validPalindrome(s));
    }
}
