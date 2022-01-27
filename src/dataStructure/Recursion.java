package dataStructure;

/**
 * 
 * @author Rohit Singh Rathour
 * 
 *         Recursion is process in which the method calls itself
 * 
 *         Why recursion : It helps in breaking big problems into smaller part
 *         and resolve it
 *
 *         Stack memory is used by recursion
 */
public class Recursion {

	public static void openRussianDoll(int doll) {
		if (doll == 1)
			System.out.println("All dolls are opened");
		else {
			System.out.println("Opening the doll: " + (doll - 1));
			openRussianDoll(doll - 1);
		}
	}

	public static void main(String... args) {
		openRussianDoll(5);
		System.out.println("factorial : "+factorial(4));
		System.out.println("fibonacci : "+fibonacci(4));
	}

	/**
	 * Factorial using recursion
	 */
	public static int factorial(int n) {
		if (n < 0)
			return -1;
		if (n == 0 || n == 1)
			return 1;
		return n * factorial(n - 1);
	}
	
	public static int fibonacci(int num ) {
		if(num<0) {
			return -1;
		}
		if(num==0 || num==1) {
			return num;
		}
		return fibonacci(num-1)+fibonacci(num-2);
	}

}
