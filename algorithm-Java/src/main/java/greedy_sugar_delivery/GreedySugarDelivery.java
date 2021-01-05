package greedy_sugar_delivery;

import java.util.Scanner;

public class GreedySugarDelivery {
	public int solution() {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int cnt = 0;
		
	while(true) {
		if (A % 5 == 0 && A % 3 == 0) {
			A-=5;
		} else if (A % 5 == 0) {
			A-=5;
		} else if (A % 3 == 0){
			A-=3;
		} else {
			A-=5;
		}
		
		cnt++;
			
		if (A == 0) {
			sc.close();
			return cnt;
		}
		if (A < 0) {
			sc.close();
			return -1;
		}
	}
	}
}
