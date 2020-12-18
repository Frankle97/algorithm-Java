package sum_of_between_two_integer;

public class SumOfBetweenTwoInteger {
	public long solution(int a, int b) {
	long answer = 0;
	if (a < b) {
	for (int i = 0; i <= b-a; i++) {
		answer += a+i;
	}
	} else {
		for (int i = 0; i <= a-b; i++) {
			answer += b+i;
		}
	}
        return answer;
    }
}
