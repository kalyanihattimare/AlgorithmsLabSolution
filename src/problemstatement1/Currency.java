package problemstatement1;

import java.util.Scanner;

public class Currency {
	
	
	 // function to count and
    // print currency notes
    public  void countCurrency(int amount)
    {
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("ENter the size of curency denominations");
    	int size=sc.nextInt();
        int[] notes = new int[size];
        System.out.println("ENter the notes of curency denominations");
        for(int i=0;i<notes.length;i++)
        {
        	notes[i]=sc.nextInt();
        }
        
        int[] noteCounter = new int[size];
      
        // count notes using Greedy approach
        for (int i = 0; i < size; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
      
        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < size; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                    + noteCounter[i]);
            }
        }
    }
     

}
