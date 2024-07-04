import java.util.*;
class Solution {
    public int solution(int[] arr) {
		int answer = 1;
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] >= 50 && arr[i] % 2 == 0) {
				arr[i] /= 2;
				flag = false;
			} else if (arr[i] < 50 && arr[i] % 2 == 1) {
				arr[i] = arr[i] * 2 + 1;
				flag = false;
			}
			if (i == arr.length - 1) {
				i = -1;
                if (flag)
					break;
				answer++;
				flag = true;
            }
        }
        return --answer;
    }
}