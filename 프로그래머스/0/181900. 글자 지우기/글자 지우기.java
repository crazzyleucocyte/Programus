import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
       
        String my_char[]=my_string.split("");
        StringBuilder my_strb = new StringBuilder();
        Arrays.sort(indices);
        int j = 0;
        for(int i = 0 ; i < my_char.length ; i++ ){

            if (i == indices [j] ){
                if(i==indices[indices.length-1]) continue;
                j++;
                continue;
            }
            my_strb.append(my_char[i]);
            
        }
        return my_strb.toString();
    }
}