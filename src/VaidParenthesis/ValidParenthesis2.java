package VaidParenthesis;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis2 {
    public boolean validParenthesis(String s){
        Stack<Character> stack=new Stack<>();
        Map<Character,Character> bracket=new HashMap<>();
        bracket.put(')','(');
        bracket.put(']','[');
        bracket.put('}','{');
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(bracket.containsKey(c)){
                if(!bracket.isEmpty() && bracket.get(c).equals(stack.peek())){
                    stack.pop();
                }

            }else stack.push(s.charAt(i));
        }
    return stack.isEmpty();
    }
    public static void main(String[] args){
        String s="[]{}(";
        ValidParenthesis2 obj=new ValidParenthesis2();
        System.out.println(obj.validParenthesis(s));
    }
}
