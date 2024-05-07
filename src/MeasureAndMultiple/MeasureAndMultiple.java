package MeasureAndMultiple;

import java.util.*;

public class MeasureAndMultiple {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int sum2 = 0;
		
		for(int i =0; i < 10000; i++) {
			double a = sc.nextInt();
			double s = sc.nextInt();
			if(a == 0 && s == 0) {
				break;
			}
			
			if(a > s) {
				if(a%s == 0) {
					System.out.println("multiple");
				}
				else {
					System.out.println("neither");
				}
			}
			else {
				if(s%a == 0) {
					System.out.println("factor");
				}
				else {
					System.out.println("neither");
				}
			}
		}
	}
}