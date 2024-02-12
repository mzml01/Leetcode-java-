package Repeatingprefix;

public class RepeatingPrefix3 {

        public String longestCommonPrefix(String[] strs) {
            //base case
            if (strs.length == 0) return "";

            //using first string as prefix to compare
            String prefix = strs[0];

            for(int i=1; i<strs.length; i++){
                //while not a prefix of strs[i], remove last char from prefix
                while(strs[i].indexOf(prefix) != 0){
                    prefix=prefix.substring(0,prefix.length()-1);
                    //if no prefix found
                    if(prefix.isEmpty()){
                        return "";
                    }
                }
            }
            return prefix;

        }
    }
