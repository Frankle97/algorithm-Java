package division_of_array;

import java.util.ArrayList;

public class DivisionOfArray {
	public int[] solution(int[] arr, int divisor) {
    int cnt = 0;
	ArrayList<Integer> list = new ArrayList<>();
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] % divisor == 0) {
		cnt++;
		list.add(arr[i]);
		}
	}
		
	if (cnt==0) list.add(-1);
		
	int[] answer = new int[list.size()];
	
	for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);
	
	
    int tmp = 0;
    
	for (int i = 0; i < answer.length; i++) {
		for (int j = 0; j < answer.length-1; j++) {
			if (answer[j] > answer[j+1]) {
				tmp = answer[j];
				answer[j] = answer[j+1];
				answer[j+1] = tmp;
				
			}
		}
	}
        return answer;
    }
}
