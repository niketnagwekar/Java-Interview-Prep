package com.Core_JAVA_Interview_Questions.StringClassQuestions.StringPrograms;

/*
 * How To Remove White Spaces from String In Java?
 */
public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		/*
		 * How To Remove White Spaces From String In Java Using Built-In Methods?
		 */
		String inputString = "OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End";
		
		String stringWithoutSpaces = inputString.replaceAll("\\s+" , "");
        
        System.out.println("Input String : "+inputString);
         
        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
        
        /*
         * How To Remove White Spaces From String Without Using Built-In Methods?
         */

        char[] charArray = inputString.toCharArray();
        
        String stringWithoutSpacesWOBuiltInMethods = "";
        
        for (int i = 0; i < charArray.length; i++) 
        {
            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
            {
            	stringWithoutSpacesWOBuiltInMethods = stringWithoutSpacesWOBuiltInMethods + charArray[i];
            }
        }
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("Input String Without Spaces  W/O Built in methods: "+stringWithoutSpacesWOBuiltInMethods);
	}

}
