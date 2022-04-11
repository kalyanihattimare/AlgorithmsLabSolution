package problemstatement1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Currency c=new Currency();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the amount ");
	     int amount=in.nextInt();
	      c.countCurrency(amount);
	    }

	}


