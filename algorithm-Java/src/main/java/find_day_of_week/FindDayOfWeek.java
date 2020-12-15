package find_day_of_week;

public class FindDayOfWeek {
	public String solution(int a, int b) {
        String answer = "";
        int days = 0;   
        int[] a1 = {0,31,29,31,30,31,30,31,31,30,31,30,31};
       String[] weeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        for (int i=1; i<2016; i++){     
          if (i%4 == 0 && i%100 != 0  || i%400 == 0){
            days+=366;
          } else {
              days += 365;
          }
        }   
        for (int i=0; i<a; i++){
            days+=a1[i];
        }
        
        days+=b;
        answer = weeks[days%7];
        
        
        return answer;
    }
}
