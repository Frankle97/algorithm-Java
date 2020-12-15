package find_middle_word;

public class FindMiddleWord {
	public String solution(String s) {
    // 테스트
	String answer = "";
    
	int length = s.length();
	if (length % 2==0) {
		answer += s.charAt((length/2)-1);
		answer += s.charAt(length/2);
	} else {
		answer += s.charAt(length/2);
	}
        return answer;
    }
}
