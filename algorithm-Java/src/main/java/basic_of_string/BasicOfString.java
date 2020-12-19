package basic_of_string;
/*
 문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다. 
 */
public class BasicOfString {
	public boolean solution(String s) {
	boolean answer = false;
	char[] ss = s.toCharArray();
	int cnt = s.length();
	for (int i = 0; i < ss.length; i++) {
		if ((int)ss[i] >= 48 && (int)ss[i] <= 57) cnt--;
	}
	if (cnt<1 && (s.length()==4 || s.length()==6)) answer = true;
	return answer;
	}
}
