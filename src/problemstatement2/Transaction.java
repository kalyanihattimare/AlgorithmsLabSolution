package problemstatement2;

import java.util.Scanner;

public class Transaction {
	
	public static void main(String args[] ) throws Exception {
	
	Scanner sc = new Scanner(System.in);
	

    System.out.println("Enter the size of transaction array");
	
	int n = sc.nextInt();
	
	int[] arr = new int[n];
	

    System.out.println("Enter the values of array");
	
	for (int i=0; i < arr.length; i++)
	{

		arr[i] = sc.nextInt();

	}
	
	System.out.println("Enter the total no of targets that needs to be acheived");

	int nqueries = sc.nextInt();

	int target = 0;

	int sum = 0;

	int flag = 0;
	
	System.out.println("Enter the values of the target");

	for (int j = 0; j < nqueries; j++) {

	
	if(sum == 0)
	{

	target = sc.nextInt();

	}

	if (target == 0){

	System.out.println(-1);

	continue;

	}
	
	System.out.println("Target acheived after Transaction : ");

	for(int i = 0; i < arr.length && sum < target; i++) { // The sum will be till it is less than The daily target

	sum += arr[i];

	flag++;

	}

	if(sum >= target){

	System.out.println(flag);

	flag = 0;

	}

	else{

	System.out.println(-1);

	flag = 0;

	}

	sum = 0;
	
	} } 

}