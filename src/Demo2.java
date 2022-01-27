public class Demo2 {
	public static void main(String... args) {
		
		String[] st = { "rohit", "mohit", "sohit", "dohit" };

/////////////////// Bubble Sort////////////////////////////////
		
//		String t;
//		for (int i = 0; i < st.length; i++) {
//			int flag = 0;
//			for (int j = 0; j < st.length - 1 - i; j++) {
//				if ((st[j].compareTo(st[j + 1])) > 0) {
//					t = st[j];
//					st[j] = st[j + 1];
//					st[j + 1] = t;
//					flag = 1;
//				}
//			}
//			if (flag == 0) {
//				break;
//			}
//		}

////////////////Selection Sort/////////////////////////////////	
		String temp;
		int min;
		for(int i=0;i<st.length;i++) {
			min = i;
			for(int j=i+1;j<st.length;j++) {
				if((st[min].compareTo(st[j]))>0) {
					min = j;
				}
			}
			temp = st[i];
			st[i]=st[min];
			st[min]=temp;
		}
		
///////////////////////////////////////////////////////////////
		for (String result : st) {
			System.out.print(result + " ");
		}

	}
}
