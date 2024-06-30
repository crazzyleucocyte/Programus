import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        //return값을 저장할 정수 배열의 길이를 어떻게 정하지..?
        int[] temp = new int[intStrs.length];
        int j=0;
        int ans=0;
        for(String num : intStrs){
            ans= Integer.parseInt(num.substring(s,s+l));
            if (ans>k){
                temp[j]=ans;
                j++;
            }
        }
        temp=Arrays.copyOf(temp,j);
     
        return temp;
    }
}