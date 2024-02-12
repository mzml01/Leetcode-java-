public class Main2 {
    public String MergeStringAlt(String wrd1, String wrd2){
        int n=wrd1.length()+wrd2.length();
        char[] wrd11=wrd1.toCharArray();
        char[] wrd22=wrd2.toCharArray();
        char[] mergeWrd=new char[n];
        int i=0;
        while(i<wrd11.length || i<wrd22.length){
            if(i<wrd11.length){
                mergeWrd[i]=wrd11[i];

            }
            if(i< wrd22.length){
                mergeWrd[i++]=wrd22[i];

            }
            i++;
        }
        String wrd=mergeWrd.toString();
        return wrd;
    }
    public static void main(String[] args){
        Main2 obj=new Main2();
        System.out.println(obj.MergeStringAlt("mohd","mzml"));
    }
}
