import java.util.Scanner;

public class Try {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     StringBuilder code=new StringBuilder();
     String s=sc.nextLine();
     int code1= s.codePoints().sum();

     for(int i=0;i<s.length();i++){

         code.append(s.codePointAt(i)+" ");

     }
     System.out.println(code.toString()+code1);

    }
}

