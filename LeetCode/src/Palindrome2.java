import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String sa=sc.nextLine();
        StringBuffer s=new StringBuffer(sa);
        s.reverse();
        if(sa.equalsIgnoreCase(s.toString())){
            System.out.println("Yaay, Palindrome the word is  "+s);
        }System.out.println("nope herer what you get "+s);
    }
}
