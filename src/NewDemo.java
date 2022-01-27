
public class NewDemo {

	public static void main(String[] args) {
		System.out.println("Fibonacci series");
		int f =0,s=1,temp=0;
		int n=10;
		while(n!=0) {
			System.out.println(f+" "+temp);
			temp = f+s;
			f=s;
			s=temp;
			n--;
		}

	}

}
