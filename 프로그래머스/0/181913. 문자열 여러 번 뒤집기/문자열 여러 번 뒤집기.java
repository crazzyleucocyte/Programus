class Solution {
    public String solution(String my_string, int[][] queries) {
        
        StringBuilder my_stringb = new StringBuilder(my_string);
        for(int[] q:queries){
            StringBuilder temp=new StringBuilder(my_stringb.substring(q[0],q[1]+1));
            my_stringb.delete(q[0],q[1]+1);
            my_stringb.insert(q[0],(temp.reverse().toString()));
        }
        return my_stringb.toString();
    }
}