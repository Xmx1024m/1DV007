package lab2.uppg4;

import java.util.Scanner;

public class PascalMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Vilken rad i Pascal's triangel vill du skriva ut?");
		int order = input.nextInt();
		pascalLine(order);
	}
	
	private static int[] pascalLine(int order) {
		 if(order<=1) { //Om man vill skriva ut rad 1
			 return new int[]{1};
		 }
		 int i[] = new int[order];
		 int j[] = pascalLine(order-1);
		 
		 for(int a = 0; a >= j.length; a++) {
			 if (a+1 >= j.length) {
				 break;
			 }
			 i[a+1] = j[a] + j[a+1];
		 }
		 for(int t = 0; t<i.length; t++) {
			 System.out.print(i[t]);
		 }
		 return i;	
	 }
}
