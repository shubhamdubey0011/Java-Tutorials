package net.valtech.practise;

public class RLab {

	public static void main(String[] args) {

		// String s1 = "RED FOX";
		//
		// StringBuffer sb = new StringBuffer(s1);
		// System.out.println(sb.reverse());

//		String s1 = "RED FOX";
//
//		int size = s1.length();
//		for (int i=size - 1; i >=0; i--) 
//		{
//
//			System.out.print(s1.charAt(i));
//		}

		
		// String input2 = "RED FOX";
		//
		// // getBytes() method to convert string
		// // into bytes[].
		// byte [] strAsByteArray = input2.getBytes();
		//
		// byte [] result =
		// new byte [strAsByteArray.length];
		//
		// // Store result in reverse order into the
		// // result byte[]
		//
		// for (int i = 0; i<strAsByteArray.length; i++)
		// result[i] = strAsByteArray[strAsByteArray.length-i-1];
		//
		// System.out.println(new String(result));


		String s = "My name is Sarthak ";
	    StringBuffer sb = new StringBuffer();
	    int n = s.length();
	    int j =n;
	    int i;
	    for(i = n-1;i>=0;i--){

	        if(s.charAt(i) == ' '){
	            sb.append(s.substring(i+1, j));
	            sb.append(" ");
	            j = i;
	        }
	    }
	    sb.append(s.substring(0,j));
	    System.out.println(sb);
	}
	}

