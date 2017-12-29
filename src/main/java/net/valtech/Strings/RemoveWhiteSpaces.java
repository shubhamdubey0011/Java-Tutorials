package net.valtech.Strings;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {

		//String str = "   Core Java jsp servlets             jdbc struts hibernate spring  ";
		
		
		

		String str = "I Love                Java";
		
//		String s[]=str.split(" ");
//		String newStr=" ";
//		for(int i=0;i<s.length;i++){
//		newStr=newStr+s[i];
//		}
//		System.out.println(newStr);
//		}
		
		
			String[] strArr = str.split(" ");
			StringBuilder sb = new StringBuilder();
			for(String str1: strArr){
			sb.append(str1);

			}
			System.out.println("tring without Space ="+sb);
			
	
	
	
	
	

		/*
		 * String stringwithoutSpaces = str.replaceAll("\\s", "");
		 * System.out.println(stringwithoutSpaces);
		 */

		/*char[] strArray = str.toCharArray();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				sb.append(strArray[i]);
			}
		}

		System.out.println(sb);
*/
		
		
		
		
	}
}
