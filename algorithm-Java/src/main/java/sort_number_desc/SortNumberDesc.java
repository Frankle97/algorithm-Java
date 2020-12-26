package sort_number_desc;
/*
문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
입출력 예
n	return
118372	873211
 */
public class SortNumberDesc {
	public long solution(long n) {
		String tmp = "" + n;
		int[] amt = new int[tmp.length()];
		for (int i = 0; i < tmp.length(); i++) {
			String tp = "" + tmp.charAt(i);
			amt[i] = Integer.parseInt(tp);
		}
		int t = 0;
		for (int i = 0; i < amt.length; i++) {
			for (int j = 0; j < amt.length-1; j++) {
				if (amt[j] < amt[j+1]) {
					t = amt[j];
					amt[j] = amt[j+1];
					amt[j+1] = t;
				}
			}
		}
		long answer = 0;
		String tt = "";
		for (int i=0; i < amt.length; i++) {
			tt += amt[i];
		}
		answer = Long.parseLong(tt);
	    return answer;
	    }
}
