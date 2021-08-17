package kyu7;
/*
 
  Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

	Examples
		"This is an example!" ==> "sihT si na !elpmaxe"
		"double  spaces"      ==> "elbuod  secaps"
 * */
public class Reversewords {
	public static String reverseWords(final String original) {
		String f = "";
		if(original.trim().length() == 0) {
			return original;
		}
		
		String[] a = original.split(" ");
	   
			for(int i = 0; i < a.length; i++) {
	      
				String palavra = a[i];
				String r = "";
	      
				for(int j = palavra.length() -1 ; j >= 0; j--) {
	        
					r += palavra.charAt(j);
	        
				}
			f += r + " " ;
			}
		if(f.indexOf(" ") == 0) {
			return f;
		}
		return f.trim();
	}
	  
}
