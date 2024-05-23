import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int i=0;
        do{
            System.out.print(str);
            i++;
        }while(i<n);
    }
}