package findingSucstringInString;

public class FindingSubstying {
    public int findString(String hay, String needle){
        if(hay.indexOf(needle)!=-1){
            return 0;
        }
        return -1;
    }
    public static void main(String[] args){
        String hay="hello";
        String needle="ll";
        FindingSubstying obj=new FindingSubstying();
        System.out.println(obj.findString(hay,needle));
    }
}
