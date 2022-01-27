import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
	
	public static void main(String []args) throws ParseException {
	
		// Interview practice 
		
////////////////////Andrey//////////////////////////////////////////////////////
		
		/*
		 * int[] intArray = new int[] {1,8,6,2,5,4,8,3,7}; int volume = 0; int
		 * arrayLength = intArray.length; int leftValue = 0, rightValue = 0,
		 * operatingValue = 0, distance = 0, total = 0;
		 * 
		 * for (int i = arrayLength; i > 1; i--) { //
		 * System.out.println("i >>>>>>>>>>>>>>>>>>>>>>>>> " + i);
		 * 
		 * for (int j = 0; j < arrayLength; j++) {
		 * 
		 * leftValue = intArray[j]; rightValue = intArray[i -1];
		 * 
		 * operatingValue = leftValue < rightValue ? leftValue : rightValue;
		 * System.out.println("operatingValue > " + operatingValue);
		 * 
		 * distance = i - (j + 1); System.out.println("distance > " + distance);
		 * 
		 * total = operatingValue * distance; System.out.println("total > " + total);
		 * 
		 * if (volume < total) { volume = total; System.out.println("Volume = \n\n" +
		 * volume); }
		 * 
		 * } }
		 */
		
////////////////////////////////////////////////////////////////////
//		
//		int[] arr = {1,3,4,5,2};
//		int sum = 7;
//		int count=0;
//		for(int i=0;i<arr.length;i++) {z
//			if(i!=arr.length-1) {
//			int j=i+1;
//			if(arr[i]+arr[j]==sum) {
//				System.out.println(arr[i]+" "+arr[j]);
//				count++;
//			}
//		  }
//		}
//		System.out.println("Count:"+count);
////////////////////////////////////////////////////////////////////
		
		//String reverse
//		String s="rohit";
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}
//		System.out.println();
//		String s2 = "Rohit Singh Rathour"; // Array splitting
//		String[] newArr = s2.split(" ");
//		System.out.println(newArr[0]);
		
//////////////////////// Word count////////////////////////////////
		
//		String s = "rohit singh rohit singh rathour how much rohit";
//		String[] s2 = s.split(" ");	
//		
//		for(int i=0;i<s2.length;i++) {
//			int count=1;
//			for(int j=i+1;j<s2.length;j++) {
//				if(s2[i].equals(s2[j])) {
//					count++;
//					s2[j]=" ";
//					
//				}
//			}
//			if(s2[i]!=" ")
//			System.out.println(s2[i]+":"+count);
//		}
		
////////////////////////////Compare Two Dates/////////////////////////////
//		 Date d1 = sdformat.parse("2019-04-15");
//	      Date d2 = sdformat.parse("2019-08-10");
//	      System.out.println("The date 1 is: " + sdformat.format(d1));
//	      System.out.println("The date 2 is: " + sdformat.format(d2));
//	      if(d1.compareTo(d2) > 0) {
//	         System.out.println("Date 1 occurs after Date 2");
//	      } else if(d1.compareTo(d2) < 0) {
//	         System.out.println("Date 1 occurs before Date 2");
//	      } else if(d1.compareTo(d2) == 0) {
//	         System.out.println("Both dates are equal");
//	      }
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = new Date();
		System.out.println(d1);
		Date d2 = sdf.parse("2021-07-14");
		System.out.println(d2);
	    if(d1.compareTo(d2)>0) System.out.println("Current date is greater");
	    else if(d1.compareTo(d2)<0) System.out.println("Current date is smaller");
		
	}

}


