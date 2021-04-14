import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BubbleSort{

	private static final Scanner scanner = new Scanner(System.in);
	private static int[] number = {};

	public static int[] sortingArray(int[] number){
		for(int i=0; i<number.length; i++){
			int flag = 0;
			for(int j=0; j<number.length-1-i; j++){
				if(number[j] > number[j+1]){
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					flag = 1;
				}
			if(flag == 0)
				break;
			}
		}
		//System.out.println("The list of sorted array is "+Arrays.toString(number));
		return number;
	}

	public static void main(String[] args){
		System.out.println("The provided array is "+ Arrays.toString(number));
 
		System.out.println("Please! enter the size of array.");
		int size = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for(int i=0; i<size; i++){
			System.out.println("Enter the number to be sorted");
			int num = scanner.nextInt();
			number = Arrays.copyOf(number, number.length + 1);
			number[number.length - 1] = num;
		}
		scanner.close();
		

		System.out.println("The list before sorting is "+Arrays.toString(number));
		
		sortingArray(number);
		System.out.println("The list of sorted array is " + Arrays.toString(number));
	}
}
