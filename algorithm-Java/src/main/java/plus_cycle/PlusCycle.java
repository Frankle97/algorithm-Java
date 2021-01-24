package plus_cycle;

import java.util.Scanner;

public class PlusCycle {
	public static int plusCycle(int N) {
		int cnt = 0;
		int copy = N;
        
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
 
			if (copy == N) {
				return cnt;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(plusCycle(sc.nextInt()));
		sc.close();
	}
}
