class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int tempRank[]=new int[rank.length];
        boolean tempAttd[]=new boolean[attendance.length];
        for(int i = 0;i<rank.length;i++){
            tempRank[rank[i]-1]=i;
            tempAttd[rank[i]-1]=attendance[i];
        }
        int ten=4;
        for(int j=0;j<tempAttd.length;j++){
            if(tempAttd[j]){
                answer+=tempRank[j]*Math.pow(10,ten);
                ten-=2;
            }
        }
        
        return answer;
    }
}