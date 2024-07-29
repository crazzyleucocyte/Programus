import java.util.*;
class Solution {
    public String solution(String a, String b) {
        StringBuilder answer=new StringBuilder();

       int length = (a.length()>b.length())? a.length():b.length();
        int temp =0;
        String stra[]=a.split("");
        String strb[]=b.split("");
            System.out.println(length);
        int cha=0;
        int chb=0;
        int temp2=0;
        int i=stra.length-1;
        int j=strb.length-1;
        
        for(int idx =length-1;idx>=0;idx--,i--,j--){
            cha=(i<0)?0:Integer.parseInt(stra[i]);
            chb=(j<0)?0:Integer.parseInt(strb[j]);
            
            temp = cha+chb;
            
            if(idx!=0)
            answer.insert(0, String.valueOf((temp2+temp)%10));
            else 
            answer.insert(0, String.valueOf(temp2+temp));
            
            temp2=((temp+temp2)/10);

        }
        return answer.toString();
    }
}