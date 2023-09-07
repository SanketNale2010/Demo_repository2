package Task;

public class scenario5 {
	
	public static void main(String[] args) {
		
		
		    
//		        String S1 = "Your order number is XXXX. Please note this for future reference";
//
//		        // Define the dynamic placeholder
//		        String dynamicText = "XXXX";
//
//		        // Find the index of the dynamic text
//		        int startIndex = S1.indexOf(dynamicText);
//
//		        if (startIndex != -1) {
//		            // Extract the pre and post text
//		            String preText = S1.substring(0, startIndex).trim();
//		            String postText = S1.substring(startIndex + dynamicText.length()).trim();
//
//		            // Output the pre and post text
//		            System.out.println("Pre Text: " + preText);
//		            System.out.println("Post Text: " + postText);
//		        } else {
//		            System.out.println("Dynamic text not found in the string.");
//		        }
		        
		        
//		        String S1 = "Your order number is XXXX. Please note this for future reference";
//
//	            // Define the dynamic value (XXXX) to be compared
//
//	            String dynamicValue = "1234";
//	            // Find the index of the dynamic value in the string
//
//	            int index = S1.indexOf(dynamicValue);
//	            
//	            if (index != -1) {
//
//	                // Extract the pre-text and post-text
//
//	                String preText = S1.substring(0, index);
//
//	                String postText = S1.substring(index + dynamicValue.length());
//
//
//	                // Compare the lengths of preText and postText
//
//	                if (preText.length() == postText.length()) {
//
//	                    System.out.println("Pre-text and post-text lengths are the same.");
//
//	                } else {
//
//	                    System.out.println("Pre-text and post-text lengths are different.");
//
//	                }
//
//	            } else {
//
//	                System.out.println("Dynamic value not found in the string.");
//
//	            }

	            // Close the WebDriver

	            //driver.quit();
	            
	            
				String S1 = "Your order number is XXXX. Please note this for future reference";
				String S2 = "Your order number is YYYY. Please note this for future reference";

				int length1 = S1.length();

				int length2 = S2.length();

				System.out.println("Length of the string S1: " + length1);

				System.out.println("Length of the string S2: " + length2);

				if (length1 == length2) {

					String[] arrOfStr1 = S1.split(" ");

					String[] arrOfStr2 = S2.split(" ");

					int arrLength = arrOfStr1.length;

					if (arrLength == arrOfStr2.length) {

						String status = "success"; // Assume success initially

						for (int i = 0; i < arrLength; i++) {
							if (i == 4) { // Check if it's the fifth word (0-based index)

								// Do nothing for the fifth word

							} else {

								if (!arrOfStr1[i].equals(arrOfStr2[i])) {
									status = "fail";

									break; // Exit the loop as soon as a mismatch is found
								}
							}
						}
						System.out.println("Status: " + status);

					} else {

						System.out.println("Status: fail (Different number of words)");
					}

				} else {

					System.out.println("Status: fail (Different string lengths)");
				}
			}
		}
		

