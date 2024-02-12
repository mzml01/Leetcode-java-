public class Palindrome {
    public static void main(String[] args){
        Palindrome obj=new Palindrome();
        System.out.println(obj.Pali(121));
    }
    public boolean Pali(int x){
        int reverse=0;
        if(x<0){
            System.out.println(false);
        }
        int y=x;
        while(x>0){
            reverse=reverse*10+(x%10);
            x/=10;
        }
        return (reverse==y);
    }
}
