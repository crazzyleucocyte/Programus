class Solution {
int n;
    
    public int move(int n,char con){
       
        if(con=='w')n=1;
        else if(con=='s')n=-1;
        else if(con=='d')n=10;
        else if(con=='a')n=-10;

        return this.n=this.n+n;
    }
    public int solution(int n, String control) {
        this.n=n;
        
        for(char chArray : control.toCharArray()){
            move(this.n,chArray);
        }
        
        return this.n;
    }
}