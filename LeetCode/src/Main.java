public class Main {
    public String MergeStringAlternatively (String wrd1,String wrd2){
        StringBuilder s=new StringBuilder();
        int i=0;
        while(i<wrd1.length() || i<wrd2.length()){
            if(i<wrd1.length()){
                s.append(wrd1.charAt(i));
            }
            if(i<wrd2.length()){
                s.append(wrd2.charAt(i));
            }
            i++;
        }
        return s.toString();
    }
    public static void main(String[] args) {
        Main obj=new Main();
        System.out.println(obj.MergeStringAlternatively("mohd","mzml"));
    }
}