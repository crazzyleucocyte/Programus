import java.util.*;
class Solution {
    public int[] solution(String myString) {
        int str[] = new int[myString.length()];
        int idx =0;
        for(String ans : myString.split("x",-1)){
            str[idx++]=(ans.length());
        }
        // if(myString.charAt(myString.length()-1)=='x') str[++idx]=(0);
        return Arrays.copyOf(str,idx);
    }
}