package programmers_check_level;

public class Level_One_First {
	public String solution(int a, int b) {
    String answer = "";
    int days = 0;
    int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
    String[] result = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    for (int i=1; i < 2016; i++) {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            days += 366;
        } else {
            days += 365;
        }
    }
    for (int i=0; i < a; i++) {
        days+=month[i];
    }
    days += b;
    answer = result[days%7];
    
    return answer;
    }
}
