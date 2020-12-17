package count_char_of_string;

public class CountCharOfString {
	boolean solution(String s) {
	char[] ch = s.toLowerCase().toCharArray();
	boolean answer = false;
	for (int i = 0, p = 0, y = 0; i < ch.length; i++) {
		if (ch[i] == 'p') {
			p++;
		} else if (ch[i] == 'y') {
			y++;
		}
		if (i == ch.length-1 && (p == y)) {
			answer = true;
		}
        if (i == ch.length-1 && p == 0 && y == 0) {
			answer = true;
		}
	}
	        return answer;
	}
}
