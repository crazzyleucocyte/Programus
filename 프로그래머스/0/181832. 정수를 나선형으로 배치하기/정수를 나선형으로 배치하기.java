class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int [n][n];
        int idx = 1;
        //4방향으로 도는데 이걸 switch-case로 1-2-3-4-1-2-3-4 이렇게 돌면?
        int toggle=1;
        int i =0;
        int j=0;
        boolean flag=true;//count를 줄여주는애
        int count =n; //반복횟수
        int fin=n;
        //4->3->3->2->2->1->1>끝(0이면)
       
        do{
            switch(toggle){
                case 1: 
                    answer[i][j]=idx++;
                    if(count==1)i++;
                    else j++; 
                    break;
                case 2:
                    answer[i][j]=idx++;
                    if(count==1)j--;
                    else i++;
                    break;
                case 3:
                    answer[i][j]=idx++;
                    if(count==1)i--;
                    else j--;
                    break;
                case 4:
                    answer[i][j]=idx++;
                    if(count==1)j++;
                    else i--;
                    break;
                    
            }
            if(count==1){
                toggle++;
                if(toggle==5) toggle=1;
                if(flag) {
                    count=--fin;
                    count++;
                    if(fin==0){ break;}
                }else{
                    count=fin;
                    count++;
                    
                }
                flag= !flag;
            }
            count--;
        }while(idx!=(n*n+1));
       
        return answer;
    }
}