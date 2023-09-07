package Task;

import java.util.Iterator;

public class prePostText {
    public static void main(String[] args) {
        String sentence = "Your order number is XXXX. Please note this for future reference";
        String sentence2 = "Yor order number is X12X. Please note this for future reference"; 	

        // Split the sentence into words based on spaces
        String[] words = sentence.split(" ");
        String[] words2 = sentence2.split(" ");
        
        System.out.println(words.length);

        // Loop through the words and print them
       for (int i = 0; i < words.length; i++) {
    	   if (i<5 || i<12) {
    		   for (int j = 0; j < words2.length; j++) {
    			   
        		   if (i==j) {
            		   System.out.print(" "+words[i]);
    			
    		}
			
		}
    	   
    	  
			
		}
		
	}
    }
}
