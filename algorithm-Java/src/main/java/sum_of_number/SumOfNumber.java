package sum_of_number;
/*
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 */
public class SumOfNumber {
	public int solution(int N, String tmp) {
		int answer = 0;
		for (int i = 0; i < N; i++) {
			answer += Integer.parseInt(String.valueOf(tmp.charAt(i)));
		}
		return answer;
	}
}
